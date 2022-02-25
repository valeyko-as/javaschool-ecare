package com.javaschool.ale3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("possible_options")
public class PossibleOptions {
    @Id
    private Integer id;
    @MappedCollection(idColumn = "additional_option_id")
    private AdditionalOption option;
    @MappedCollection(idColumn = "tariff_id")
    private Tariff tariff;
}
