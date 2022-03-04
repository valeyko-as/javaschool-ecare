package com.javaschool.ale3.repositories;

import com.javaschool.ale3.data.Tariff;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.function.Consumer;

@Repository("TariffDAO")
public class TariffDAO implements InterfaceDAO<Tariff, Integer> {
    private EntityManager entityManager;

    @Override
    public Tariff get(Integer id) {
        return entityManager.find(Tariff.class, id);
    }

    @Override
    public List<Tariff> getAll() {
        Query query = entityManager.createQuery("SELECT e FROM Tariff e");
        return query.getResultList();
    }

    @Override
    public void delete(Tariff tariff) {
        executeInsideTransaction(entityManager -> entityManager.remove(tariff));
    }

    public List<Tariff> findByName(String name) {
        Query query = entityManager.createQuery("SELECT e FROM Tariff e where e.name = :name");
        query.setParameter("name", name);
        return query.getResultList();
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        }
        catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }
    }
}

