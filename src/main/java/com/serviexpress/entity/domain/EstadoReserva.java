package com.serviexpress.entity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.common.ReservaHora;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class EstadoReserva extends BaseDomainEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoReserva")
    @JsonIgnore
    private Set<ReservaHora> reservaHoras;
}
