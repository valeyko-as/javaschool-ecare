package com.javaschool.ale3.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ClientDTO {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private String passport;
    private String email;
}
