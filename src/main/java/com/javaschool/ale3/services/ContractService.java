package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Contract;

import java.util.List;

public interface ContractService extends ServiceInterface<Contract> {
    public List<Contract> findByClientId(Integer id);
    public Contract findByPhone(String phone);
    public void update(Contract contract);
}
