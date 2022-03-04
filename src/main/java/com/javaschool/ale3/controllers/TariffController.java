package com.javaschool.ale3.controllers;

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

    @GetMapping(path = "/show")
    public @ResponseBody Iterable<Tariff> getAllTariffs() {
        return tariffService.getAll();
    }

}
