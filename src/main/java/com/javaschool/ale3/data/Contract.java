package com.javaschool.ale3.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Getter
    @Setter
    private String number;
    @Getter
    @Setter
    private boolean clientBlock;
    @Getter
    @Setter
    private boolean employeeBlock;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Client client;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tariff_id")
    private Tariff tariff;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "contract_id")
    private List<SelectedOptions> selectedOptions = new ArrayList<>();

}
