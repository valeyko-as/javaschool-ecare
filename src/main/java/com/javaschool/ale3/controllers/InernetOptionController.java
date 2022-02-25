package com.javaschool.ale3.controllers;

import com.javaschool.ale3.repositories.InternetOptionRepository;
import com.javaschool.ale3.data.InternetOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/internet_option")
public class InernetOptionController {
    @Autowired
    private InternetOptionRepository ioRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewInternetOption(@RequestParam String name, @RequestParam Integer price) {
        InternetOption newIO = new InternetOption();
        newIO.setName(name);
        newIO.setPrice(price);
        ioRepository.save(newIO);
        return "Added";
    }

    @GetMapping(path = "/show")
    public @ResponseBody Iterable<InternetOption> getAllIO() {
        return ioRepository.findAll();
    }
}
