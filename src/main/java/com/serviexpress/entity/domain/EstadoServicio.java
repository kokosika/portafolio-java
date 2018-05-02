package com.serviexpress.entity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.common.Servicio;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class EstadoServicio extends BaseDomainEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoServicio")
    @JsonIgnore
    private Set<Servicio> servicios;
}
