/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.common.ControlRecepcion;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class EstadoControlRecepcion extends BaseDomainEntity {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoControlRecepcion")
    @JsonIgnore
    private Set<ControlRecepcion> controlRecepcions;
}
