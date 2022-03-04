package com.javaschool.ale3.data;

import javax.persistence.*;

@Entity
@Table(name = "conflict_options")
public class ConflictOptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "additional_option_id")
    private AdditionalOption additionalOption;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "internet_option_id")
    private InternetOption internetOption;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "call_option_id")
    private CallOption callOption;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "messages_option_id")
    private MessagesOption messagesOption;
}
