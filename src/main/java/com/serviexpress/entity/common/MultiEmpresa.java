package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.EstadoEmpresa;

import javax.persistence.*;
import java.util.Set;

@Entity
public class MultiEmpresa extends BaseEntity {

    @Column(length = 100)
    private String razonSocial;
    @Column(length = 100)
    private String direccion;
    private Integer numeroTelefono;
    @Column(length = 15)
    private String rut;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoEmpresa estadoEmpresa;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "multiEmpresa")
    @JsonIgnore
    private Set<Sucursal> sucursals;

}
