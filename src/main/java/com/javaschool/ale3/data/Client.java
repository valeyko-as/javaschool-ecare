package com.javaschool.ale3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.text.DateFormat;

@Table("client")
public class Client {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private DateFormat birthDate;
    private String passport;
    private String email;
    private String password;

    public Client() {
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DateFormat getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateFormat birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
