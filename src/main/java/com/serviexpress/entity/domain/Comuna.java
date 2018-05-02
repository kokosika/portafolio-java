/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.common.Persona;

import javax.persistence.*;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class Comuna extends BaseDomainEntity {

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Provincia provincia;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comuna")
    @JsonIgnore
    private Set<Persona> personas;
}
