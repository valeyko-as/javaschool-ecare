package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Tariff;

import java.util.List;

public interface TariffService {
    public Tariff findById(Integer id);
    public List<Tariff> getAll();
    public List<Tariff> findByName(String name);
    public void delete(Integer id);
}
