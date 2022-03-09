package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Tariff;

import java.util.List;
import java.util.Optional;

public interface TariffService {
    public Optional<Tariff> findById(Integer id);
    public List<Tariff> getAll();
    public List<Tariff> getActual();
    public List<Tariff> findByName(String name);
    public Tariff findByContractId(Integer id);
    public Tariff addTariff(Tariff tariff);
    public void update(Tariff tariff);
    public void delete(Integer id);
}
