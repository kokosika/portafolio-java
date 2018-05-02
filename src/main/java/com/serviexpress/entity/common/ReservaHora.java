package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.EstadoReserva;
import com.serviexpress.entity.domain.TipoReserva;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ReservaHora extends BaseEntity {

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empleado empleado;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sucursal sucursal;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente cliente;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoReserva estadoReserva;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoReserva tipoReserva;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Vehiculo vehiculo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reservaHora")
    @JsonIgnore
    private Set<Diagnostico> diagnosticos;

}
