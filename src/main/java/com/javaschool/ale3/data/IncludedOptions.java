package com.javaschool.ale3.data;

import javax.persistence.*;

@Entity
@Table(name = "included_options")
public class IncludedOptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "additional_option_id")
    private AdditionalOption option;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tariff_id")
    private Tariff tariff;
}
