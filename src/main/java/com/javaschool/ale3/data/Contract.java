package com.javaschool.ale3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("contract")
public class Contract {
    @Id
    private Integer id;
    private String number;
    private boolean block;

    @MappedCollection(idColumn = "client_id")
    private Client client;
    @MappedCollection(idColumn = "tariff_id")
    private Tariff tariff;

    public boolean isBlocked() {
        return block;
    }

    public void setBlocked() {
        this.block = true;
    }

    public void setUnblocked() {
        this.block = false;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }
}
