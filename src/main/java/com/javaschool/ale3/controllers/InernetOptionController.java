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
    private InternetOptionRepository internetOptionRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewInternetOption(@RequestParam String name, @RequestParam Integer price) {
        InternetOption internetOption = new InternetOption();
        internetOption.setName(name);
        internetOption.setPrice(price);
        internetOptionRepository.save(internetOption);
        return "Added";
    }

    @GetMapping(path = "/show")
    public @ResponseBody Iterable<InternetOption> getAllInternetOptions() {
        return internetOptionRepository.findAll();
    }
}
