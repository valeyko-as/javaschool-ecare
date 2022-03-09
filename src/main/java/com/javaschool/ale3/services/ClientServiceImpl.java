package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Client;
import com.javaschool.ale3.repositories.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("ClientService")
@Transactional
@Slf4j
public class ClientServiceImpl implements ClientService{
    @Autowired
    ClientRepository repository;

    @Override
    public Client findById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public List<Client> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Client> findByLastName(String name) {
        return repository.findByLastName(name);
    }

    @Override
    public List<Client> findByFullName(String lastName, String firstName) {
        return repository.findByFullName(lastName, firstName);
    }

    @Override
    public Client findByContractId(Integer id) {
        return repository.findByContractId(id);
    }

    @Override
    public Client findByPhone(String phone) {
        return repository.findByContractNumber(phone);
    }

    @Override
    public Client addClient(Client client) {
        log.debug("Added new client: ", client);
        Client savedClient = repository.saveAndFlush(client);
        return savedClient;
    }

    @Override
    public void update(Client client) {
        log.debug("Updated client: ", client);
        repository.saveAndFlush(client);
    }

    @Override
    public void delete(Integer id) {
        log.debug("Deleted client: ", repository.findById(id));
        repository.deleteById(id);
    }
}
