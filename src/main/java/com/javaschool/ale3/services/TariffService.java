package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Tariff;
import com.javaschool.ale3.dto.TariffDTO;

import java.util.List;

public interface TariffService extends ServiceInterface<Tariff> {
    List<Tariff> getActual();
    List<Tariff> findByName(String name);
    TariffDTO findByContractId(Integer id);
    TariffDTO add(TariffDTO tariff);
}
