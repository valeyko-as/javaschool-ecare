package com.javaschool.ale3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("internet_option")
public class InternetOption {
    @Id
    private Integer id;
    private String name;
    private Integer price;

    public InternetOption() {
    }

    public InternetOption(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
