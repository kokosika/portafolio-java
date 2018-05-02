package com.serviexpress.repositorios.interfaces;

/**
 * Interface base de herencia de las interfaces de los repositorios, tiene como parametro el nombre
 * del recurso que se desea transportar (cursores de extracion de los procedimientos almacenados.).
 * <p>
 * 1.0 Franco Cortez - Version inicial
 */
public interface IBaseRepositorio {

    /**
     * Contiene la referencia de cursor en oracle para extraer los datos y mapearlos con los dto
     * en caso de no utilizar cursores como en MySql, es la referencia de select que se utiliza como
     * procedimiento almacenado.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     */
    public String DATA = "DATA";
}
