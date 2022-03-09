package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Tariff;
import com.javaschool.ale3.repositories.TariffRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("TariffService")
@Transactional
@Slf4j
public class TariffServiceImpl implements TariffService {
    @Autowired
    private TariffRepository repository;

    @Override
    public Optional<Tariff> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<Tariff> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Tariff> getActual() {
        return repository.getActualTariffs();
    }

    @Override
    public List<Tariff> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Tariff findByContractId(Integer id) {
        return repository.findByContractId(id);
    }

    @Override
    public Tariff addTariff(Tariff tariff) {
       Tariff savedTariff = repository.saveAndFlush(tariff);
       return savedTariff;
    }

    @Override
    public void update(Tariff tariff) {
        repository.saveAndFlush(tariff);
    }


    @Override
    public void delete(Integer id) {
        Tariff toDelete = repository.getById(id);
        toDelete.setActuality(false);
        log.debug("Deleted tariff: ", toDelete);
        repository.saveAndFlush(toDelete);
    }


}
