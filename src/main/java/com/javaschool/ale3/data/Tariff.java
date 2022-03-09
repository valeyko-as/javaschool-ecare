package com.javaschool.ale3.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "tariff")
@NoArgsConstructor
public class Tariff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Integer price;
    @Getter
    @Setter
    private boolean actuality;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "internet_option_id")
    private InternetOption internet;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "call_option_id")
    private CallOption calls;
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "messages_option_id")
    private MessagesOption messages;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tariff_id")
    private List<Contract> contracts = new ArrayList<>();
}
