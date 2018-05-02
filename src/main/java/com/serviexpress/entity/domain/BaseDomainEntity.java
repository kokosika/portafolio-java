/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.domain;

import com.serviexpress.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author pc casa
 */
@MappedSuperclass
public class BaseDomainEntity extends BaseEntity {

    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(length = 100)
    private String descripcion;

}
