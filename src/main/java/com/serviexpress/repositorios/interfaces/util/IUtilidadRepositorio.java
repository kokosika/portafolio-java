package com.serviexpress.repositorios.interfaces.util;

import com.serviexpress.dto.util.UtilidadesDto;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;

import java.util.List;

/**
 * Interface base de la logica de combos dentro de la aplicacion.
 * Hereda de la interfaz IBaseRepositorio para obtener declaraciones especificas para
 * su funcionamiento.
 * <p>
 * 1.0 Franco Cortez - Version Inicial.
 */
public interface IUtilidadRepositorio extends IBaseRepositorio {

    /**
     * Metodo que genera una lista de utilidad para los estados del cliente
     * Llama al procedimiento almacenado PRC_RADIO_ESTADO_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @return retorna una lista de utilidades de estados del cliente
     */
    public List<UtilidadesDto> getRadioEstadoCliente();

    /**
     * Metodo que genera una lista de utilidad para los estados del proveedor
     * Llama al procedimiento almacenado PRC_RADIO_ESTADO_PROVEEDOR
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @return retorna una lista de utilidades de estados del proveedor
     */
    public List<UtilidadesDto> getRadioEstadoProveedor();

    /**
     * Metodo que genera una lista de utilidad para los tipos del proveedor
     * Llama al procedimiento almacenado PRC_RADIO_TIPO_PROVEEDOR
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @return retorna una lista de utilidades de tipos del proveedor
     */
    public List<UtilidadesDto> getRadioTipoProveedor();

    /**
     * Metodo que genera una lista de utilidad para los tipos del empleado
     * Llama al procedimiento almacenado PRC_RADIO_ESTADO_EMPLEADO
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @return retorna una lista de utilidades de tipos del proveedor
     */
    public List<UtilidadesDto> getRadioEstadoEmpleado();

    /**
     * Metodo que genera una lista de utilidad para los tipo del empleado
     * Llama al procedimiento almacenado PRC_RADIO_TIPO_EMPLEADO
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @return retorna una lista de utilidades de tipos del empleado
     */
    public List<UtilidadesDto> getRadioTipoEmpleado();
}
