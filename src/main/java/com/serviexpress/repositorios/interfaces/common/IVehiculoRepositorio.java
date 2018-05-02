package com.serviexpress.repositorios.interfaces.common;

import com.serviexpress.dto.common.VehiculoCustomDto;
import com.serviexpress.dto.custom.VehiculoDto;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;

import java.util.List;

/**
 * Interface base de la logica de vehiculos dentro de la aplicacion.
 * Hereda de la interfaz IBaseRepositorio para obtener declaraciones especificas para
 * su funcionamiento.
 * <p>
 * 1.0 Franco Cortez - Version Inicial.
 */
public interface IVehiculoRepositorio extends IBaseRepositorio {

    /**
     * Metodo que registra a un vehiculo en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_VEHICULO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param vehiculoDto objeto de tipo vehiculo para registrar en la base de datos.
     */
    public void guardarVehiculo(VehiculoDto vehiculoDto);

    /**
     * Metodo que modificara a un a un vehiculo en la base de datos.
     * Llama al procedimiento almacenado PRC_UDT_VEHICULO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param vehiculoDto objeto de tipo vehiculo para modificalo en la base de datos.
     */
    public void editarVehiculo(VehiculoDto vehiculoDto);

    /**
     * Metodo que eliminara a un a un vehiculo en la base de datos.
     * Llama al procedimiento almacenado PRC_DEL_VEHICULO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param vehiculoId id del vehiculo.
     * @param estadoVehiculoId id del estado del vehiculo.
     *
     */
    public void eliminarVehiculo(Integer vehiculoId, Integer estadoVehiculoId);
    /**
     * Metodo para obtener todos los vehiculos asosciados a un cliente
     * Llama al procedimiento almacenado PRC_BUSCAR_VEHICULO_X_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param clienteId id del cliente para realizar la busqueda de los vehiculos que le corresponden
     * @return retorna un listado de vehiculos de un cliente.
     */
    public List<VehiculoCustomDto> buscarVehiculosPorIdCliente(Integer clienteId);

}
