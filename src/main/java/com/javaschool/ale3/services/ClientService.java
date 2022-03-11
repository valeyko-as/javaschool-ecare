package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Client;

import java.util.List;

public interface ClientService extends ServiceInterface<Client> {
    public List<Client> findByLastName(String name);
    public List<Client> findByFullName(String lastName, String firstName);
    public Client findByContractId(Integer id);
    public Client findByPhone(String phone);
}
