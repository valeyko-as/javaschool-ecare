package com.javaschool.ale3.controllers;

import com.javaschool.ale3.dto.TariffDTO;
import com.javaschool.ale3.services.TariffService;
import com.javaschool.ale3.data.Tariff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/tariffs")
public class TariffController {
    @Autowired
    TariffService tariffService;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Tariff> getAllTariffs() {
        return tariffService.getAll();
    }

    @GetMapping(path = "/actual")
    public @ResponseBody Iterable<Tariff> getActualTariff() {
        return tariffService.getActual();
    }

    @GetMapping(path = "/name/{name}")
    public @ResponseBody Iterable<Tariff> findTariff (@PathVariable String name) {
        return tariffService.findByName(name);
    }

    @GetMapping(path = "/id/{id}")
    public @ResponseBody Tariff findTariffById(@PathVariable Integer id) {
        return tariffService.findById(id);
    }

    @GetMapping(path = "/contractid/{id}")
    public @ResponseBody TariffDTO findByContract(@PathVariable Integer id) {
        return tariffService.findByContractId(id);
    }

    @PostMapping(path = "/delete")
    public @ResponseBody String delete(@RequestParam Integer id) {
        tariffService.delete(id);
        return "Deleted";
    }
}
