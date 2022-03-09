package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Contract;

import java.util.List;

public interface ContractService {
    public Contract findById(Integer id);
    public List<Contract> getAll();
    public List<Contract> findByClientId(Integer id);
    public Contract findByPhone(String phone);
    public Contract addContract(Contract contract);
    public void update(Contract contract);
    public void delete(Integer id);
}
