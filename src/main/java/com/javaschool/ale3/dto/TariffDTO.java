package com.javaschool.ale3.dto;

import com.javaschool.ale3.data.*;
import lombok.Data;

import java.util.List;

@Data
public class TariffDTO {
    private String name;
    private Integer price;
    private InternetOption internet;
    private CallOption calls;
    private MessagesOption messages;
}
