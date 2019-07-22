package com.github.axonmulti.projection.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PersonSummary {

    @Id
    @GeneratedValue
    private Long id;

    private String personId;

    private String addressId;

    private String fullName;

    private String streetAndNumber;

    private String zipCode;

}
