package com.roncancio.prueba.roncancioprueba.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "company")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String address;

    String name;

    String email;

    String ean;

    int telephone;

}
