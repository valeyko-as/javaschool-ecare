package com.javaschool.ale3.data;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private String passport;
    private String email;
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private List<Contract> contracts = new ArrayList<>();
}
