package com.javaschool.ale3.repositories;

import com.javaschool.ale3.data.Tariff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TariffRepository extends JpaRepository<Tariff, Integer> {

    List<Tariff> findByName(String name);

    @Query(value = "select t from Tariff t join t.contracts c where c.id = ?1")
    Tariff findByContractId(Integer id);

    List<Tariff> getTariffsByActualityIsTrue();
}
