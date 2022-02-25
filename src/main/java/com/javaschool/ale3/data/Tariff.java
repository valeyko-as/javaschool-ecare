package com.javaschool.ale3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("tariff")
public class Tariff {
    @Id
    private Integer id;
    private String name;
    private Integer price;
    private boolean actuality;

    @MappedCollection(idColumn = "internet_option_id")
    private InternetOption internet;
    @MappedCollection(idColumn = "call_option_id")
    private CallOption calls;
    @MappedCollection(idColumn = "messages_option_id")
    private MessagesOption messages;

    public Tariff() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isActuality() {
        return actuality;
    }

    public void setActuality(boolean actuality) {
        this.actuality = actuality;
    }

    public InternetOption getInternet() {
        return internet;
    }

    public void setInternet(InternetOption internet) {
        this.internet = internet;
    }

    public CallOption getCalls() {
        return calls;
    }

    public void setCalls(CallOption calls) {
        this.calls = calls;
    }

    public MessagesOption getMessages() {
        return messages;
    }

    public void setMessages(MessagesOption messages) {
        this.messages = messages;
    }
}
