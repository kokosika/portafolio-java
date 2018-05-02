package com.serviexpress.entity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.common.MultiEmpresa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class EstadoEmpresa extends BaseDomainEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoEmpresa")
    @JsonIgnore
    private Set<MultiEmpresa> multiEmpresas;
}
