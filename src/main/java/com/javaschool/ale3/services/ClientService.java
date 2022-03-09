package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Client;

import java.util.List;

public interface ClientService {
    public Client findById(Integer id);
    public List<Client> getAll();
    public List<Client> findByLastName(String name);
    public List<Client> findByFullName(String lastName, String firstName);
    public Client findByContractId(Integer id);
    public Client findByPhone(String phone);
    public Client addClient(Client client);
    public void update(Client client);
    public void delete(Integer id);
}
