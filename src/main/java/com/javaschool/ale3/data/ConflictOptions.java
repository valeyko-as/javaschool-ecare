package com.javaschool.ale3.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("conflict_options")
public class ConflictOptions {
    @Id
    private Integer id;
    @MappedCollection(idColumn = "additional_option_id")
    private AdditionalOption additionalOption;
    @MappedCollection(idColumn = "internet_option_id")
    private InternetOption internetOption;
    @MappedCollection(idColumn = "call_option_id")
    private CallOption callOption;
    @MappedCollection(idColumn = "messages_option_id")
    private MessagesOption messagesOption;
}
