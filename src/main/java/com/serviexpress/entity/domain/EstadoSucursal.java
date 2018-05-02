package com.serviexpress.entity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.common.Sucursal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class EstadoSucursal extends BaseDomainEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoSucursal")
    @JsonIgnore
    private Set<Sucursal> sucursals;


}
