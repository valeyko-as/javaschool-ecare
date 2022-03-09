package com.javaschool.ale3.controllers;

import com.javaschool.ale3.services.TariffService;
import com.javaschool.ale3.data.Tariff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
@RequestMapping(path = "/tariffs")
public class TariffController {
    @Autowired
    TariffService tariffService;

    @GetMapping(path = "/showall")
    public @ResponseBody Iterable<Tariff> getAllTariffs() {
        return tariffService.getAll();
    }

    @GetMapping(path = "/showactual")
    public @ResponseBody Iterable<Tariff> getActualTariff() {
        return tariffService.getActual();
    }

    @GetMapping(path = "/find")
    public @ResponseBody Iterable<Tariff> findTariff (@RequestParam String name) {
        return tariffService.findByName(name);
    }

    @GetMapping(path = "/findId")
    public @ResponseBody Optional<Tariff> findTariffById(@RequestParam Integer id) {
        return tariffService.findById(id);
    }

    @GetMapping(path = "/findContract")
    public @ResponseBody Tariff findByContract(@RequestParam Integer id) {
        return tariffService.findByContractId(id);
    }

    @PostMapping(path = "/delete")
    public @ResponseBody String delete(@RequestParam Integer id) {
        tariffService.delete(id);
        return "Deleted";
    }
}
