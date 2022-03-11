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
import java.util.stream.Collectors;

@Service("TariffService")
@Transactional
@Slf4j
public class TariffServiceImpl implements TariffService {
    @Autowired
    private TariffRepository repository;

    @Override
    @Transactional(readOnly = true)
    public TariffDTO findById(Integer id) {
        return TariffMapper.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    @Transactional(readOnly = true)
    public List<TariffDTO> getAll() {
        return repository.findAll().stream().map(TariffMapper::toDto).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<TariffDTO> getActual() {
        return repository.getTariffsByActualityIsTrue().stream().map(TariffMapper::toDto).collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public List<TariffDTO> findByName(String name) {
        return repository.findByName(name).stream().map(TariffMapper::toDto).collect(Collectors.toList());
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
