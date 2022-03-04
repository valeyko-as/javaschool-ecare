package com.javaschool.ale3.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "additional_option")
@NoArgsConstructor
public class AdditionalOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Integer price;
    @Getter
    @Setter
    private boolean conflict;

}
