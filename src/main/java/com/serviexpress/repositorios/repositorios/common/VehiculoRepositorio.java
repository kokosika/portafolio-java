package com.serviexpress.repositorios.repositorios.common;

import com.serviexpress.dto.common.VehiculoCustomDto;
import com.serviexpress.dto.custom.VehiculoDto;
import com.serviexpress.repositorios.context.VehiculoContext;
import com.serviexpress.repositorios.interfaces.common.IVehiculoRepositorio;
import com.serviexpress.repositorios.repositorios.BaseRepositorio;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * Repositorio encargado de gestionar las operaciones de los vehiculos dentro del sistema.
 * Hereda de la clase BaseRepositorio donde se encuentran todas las operaciones basicas
 * de consultas a la base de datos.
 * Implementa la Interface IVehiculoRepositorio donde se encuentra la declaracion de los metodos
 * publicos para la injeccion de dependencia en otra capa de la aplicacion.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
@Repository
@EnableAutoConfiguration
@Transactional
public class VehiculoRepositorio extends BaseRepositorio<VehiculoContext> implements IVehiculoRepositorio {
    /**
     * Inicializacion del contexto para leer el package en oracle y establecer la conexion.
     *
     * @param context contexto asosiacion a los procedimientos almacenados.
     */
    public VehiculoRepositorio(VehiculoContext context) {
        super(context);
    }

    /**
     * Metodo que registra a un vehiculo en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_VEHICULO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param vehiculoDto objeto de tipo vehiculo para registrar en la base de datos.
     */
    @Override
    public void guardarVehiculo(VehiculoDto vehiculoDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_PATENTE", vehiculoDto.getPatente());
        params.put("V_CLIENTE_ID", vehiculoDto.getClienteId());
        params.put("V_MARCA_VEHICULO_ID", vehiculoDto.getMarcaVehiculoId());
        params.put("V_TIPO_VEHICULO_ID", vehiculoDto.getTipoVehiculoId());
        execute("PRC_INS_VEHICULO", params);
    }

    /**
     * Metodo que modificara a un a un vehiculo en la base de datos.
     * Llama al procedimiento almacenado PRC_UDT_VEHICULO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param vehiculoDto objeto de tipo vehiculo para modificalo en la base de datos.
     */
    @Override
    public void editarVehiculo(VehiculoDto vehiculoDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_VEHICULO_ID", vehiculoDto.getId());
        params.put("V_PATENTE", vehiculoDto.getPatente());
        params.put("V_CLIENTE_ID", vehiculoDto.getClienteId());
        params.put("V_MARCA_VEHICULO_ID", vehiculoDto.getMarcaVehiculoId());
        params.put("V_TIPO_VEHICULO_ID", vehiculoDto.getTipoVehiculoId());
        execute("PRC_UDT_VEHICULO", params);
    }

    /**
     * Metodo que eliminara a un a un vehiculo en la base de datos.
     * Llama al procedimiento almacenado PRC_DEL_VEHICULO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param vehiculoId       id del vehiculo.
     * @param estadoVehiculoId id del estado del vehiculo.
     */
    @Override
    public void eliminarVehiculo(Integer vehiculoId, Integer estadoVehiculoId) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_VEHICULO_ID", vehiculoId);
        params.put("V_ESTADO_VEHICULO_ID", estadoVehiculoId);
        execute("PRC_DEL_VEHICULO", params);
    }

    /**
     * Metodo para obtener todos los vehiculos asosciados a un cliente
     * Llama al procedimiento almacenado PRC_BUSCAR_VEHICULO_X_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param clienteId id del cliente para realizar la busqueda de los vehiculos que le corresponden
     * @return retorna un listado de vehiculos de un cliente.
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<VehiculoCustomDto> buscarVehiculosPorIdCliente(Integer clienteId) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_ID_CLIENTE", clienteId);
        return (List<VehiculoCustomDto>) executeList(VehiculoCustomDto.class, "PRC_BUSCAR_VEHICULO_X_CLIENTE", params);
    }

}

