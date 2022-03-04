package com.javaschool.ale3.services;

import com.javaschool.ale3.data.Tariff;
import com.javaschool.ale3.repositories.TariffDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("TariffService")
@Transactional
public class TariffServiceImpl implements TariffService {
    @Autowired
    private TariffDAO tariffDAO;

    public Tariff findById(Integer id) {
        return tariffDAO.get(id);
    }

    public List<Tariff> getAll() {
        return tariffDAO.getAll();
    }

    public List<Tariff> findByName(String name) {
        return tariffDAO.findByName(name);
    }

    public void delete(Integer id) {
        Tariff tariff = tariffDAO.get(id);
        tariffDAO.delete(tariff);
    }


}
