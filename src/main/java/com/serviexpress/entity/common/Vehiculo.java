package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.MarcaVehiculo;
import com.serviexpress.entity.domain.TipoVehiculo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Vehiculo extends BaseEntity {

    @Column(length = 10)
    private String patente;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoVehiculo tipoVehiculo;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MarcaVehiculo marcaVehiculo;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehiculo")
    @JsonIgnore
    private Set<ReservaHora> reservaHoras;
}
