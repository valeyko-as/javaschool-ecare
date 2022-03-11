package com.javaschool.ale3.data;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "tariff")
@Data
public class Tariff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    private boolean actuality;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "internet_option_id")
    private InternetOption internet;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "call_option_id")
    private CallOption calls;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "messages_option_id")
    private MessagesOption messages;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tariff_id")
    private List<Contract> contracts = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tariff_id")
    private List<PossibleOptions> possibleOptions = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tariff_id")
    private List<IncludedOptions> includedOptions = new ArrayList<>();
}
