package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class AnulacionVenta extends BaseEntity {

    @Temporal(TemporalType.DATE)
    private Date fechaAnulacion;
    @Column(length = 200)
    private String motivo;


    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ventas ventas;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empleado empleado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anulacionVenta")
    @JsonIgnore
    private Set<DetalleAnulacionVenta> detalleAnulacionVentas;

}
