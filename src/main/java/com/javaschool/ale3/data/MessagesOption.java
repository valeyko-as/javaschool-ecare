package com.javaschool.ale3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("messages_option")
public class MessagesOption {
    @Id
    private Integer id;
    private String name;
    private Integer price;

    public MessagesOption() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
