package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Contract;
import com.javaschool.ale3.repositories.ContractRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ContractService")
@Transactional
@Slf4j
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository repository;

    @Override
    public Contract findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Contract> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Contract> findByClientId(Integer id) {
        return repository.findByClientId(id);
    }

    @Override
    public Contract findByPhone(String phone) {
        return repository.findByNumber(phone);
    }

    @Override
    public Contract add(Contract contract) {
        log.debug("Added contract: ", contract);
        Contract savedContract = repository.saveAndFlush(contract);
        return savedContract;
    }

    @Override
    public void update(Contract contract) {
        log.debug("Updated contract: ", contract);
        repository.saveAndFlush(contract);
    }

    @Override
    public void delete(Integer id) {
        log.debug("Deleted contract: ", repository.findById(id));
        repository.deleteById(id);
    }
}
