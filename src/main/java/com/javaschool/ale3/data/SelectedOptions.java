package com.javaschool.ale3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("selected_options")
public class SelectedOptions {
    @Id
    private Integer id;

    @MappedCollection(idColumn = "additional_option_id")
    private AdditionalOption option;
    @MappedCollection(idColumn = "contract_id")
    private Contract contract;

    public SelectedOptions() {
    }

    public AdditionalOption getOption() {
        return option;
    }

    public void setOption(AdditionalOption option) {
        this.option = option;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
