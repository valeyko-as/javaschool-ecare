package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Tariff;
import com.javaschool.ale3.dto.TariffDTO;

import java.util.List;

public interface TariffService extends ServiceInterface<TariffDTO> {
    List<TariffDTO> getActual();
    List<TariffDTO> findByName(String name);
    TariffDTO findByContractId(Integer id);
    public void update(Tariff tariff);
}
