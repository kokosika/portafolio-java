/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class Provincia extends BaseDomainEntity {


    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Region region;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "provincia")
    @JsonIgnore
    private Set<Comuna> comunas;
}
