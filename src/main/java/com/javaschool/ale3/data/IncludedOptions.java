package com.javaschool.ale3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("included_options")
public class IncludedOptions {
    @Id
    private Integer id;
    @MappedCollection(idColumn = "additional_option_id")
    private AdditionalOption option;
    @MappedCollection(idColumn = "tariff_id")
    private Tariff tariff;
}
