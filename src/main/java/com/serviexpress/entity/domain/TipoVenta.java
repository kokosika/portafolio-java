package com.serviexpress.entity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.common.Ventas;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class TipoVenta extends BaseDomainEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoVenta")
    @JsonIgnore
    private Set<Ventas> ventas;
}
