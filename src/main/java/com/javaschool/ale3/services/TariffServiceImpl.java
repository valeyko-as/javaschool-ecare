package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Tariff;
import com.javaschool.ale3.dto.TariffDTO;
import com.javaschool.ale3.dtomapper.TariffMapper;
import com.javaschool.ale3.repositories.TariffRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("TariffService")
@Transactional
@Slf4j
public class TariffServiceImpl implements TariffService {
    @Autowired
    private TariffRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Tariff findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tariff> getAll() {
        return repository.findAll();
    }

    @Override
    public Tariff add(Tariff tariff) {
        Tariff savedTariff = repository.saveAndFlush(tariff);
        log.debug("Added new tariff: ", savedTariff);
        return savedTariff;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tariff> getActual() {
        return repository.getTariffsByActualityIsTrue();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Tariff> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    @Transactional(readOnly = true)
    public TariffDTO findByContractId(Integer id) {
        return TariffMapper.toDto(repository.findByContractId(id));
    }

    @Override
    public TariffDTO add(TariffDTO tariffDTO) {
        Tariff savedTariff = TariffMapper.toEntity(tariffDTO);
        repository.saveAndFlush(savedTariff);
        log.debug("Added new tariff: ", tariffDTO);
        return tariffDTO;
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
