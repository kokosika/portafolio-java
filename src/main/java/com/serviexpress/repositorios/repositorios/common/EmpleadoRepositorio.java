package com.serviexpress.repositorios.repositorios.common;

import com.serviexpress.dto.common.EmpleadoCustomDto;
import com.serviexpress.dto.custom.EmpleadoDto;
import com.serviexpress.repositorios.context.EmpleadoContext;
import com.serviexpress.repositorios.interfaces.common.IEmpleadoRepositorio;
import com.serviexpress.repositorios.repositorios.BaseRepositorio;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;


/**
 * Repositorio encargado de gestionar las operaciones de los empleados dentro del sistema.
 * Hereda de la clase BaseRepositorio donde se encuentran todas las operaciones basicas
 * de consultas a la base de datos.
 * Implementa la Interface IEmpleadoRepositorio donde se encuentra la declaracion de los metodos
 * publicos para la injeccion de dependencia en otra capa de la aplicacion.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
@Repository
@EnableAutoConfiguration
@Transactional
public class EmpleadoRepositorio extends BaseRepositorio<EmpleadoContext> implements IEmpleadoRepositorio {

    /**
     * Inicializacion del contexto para leer el package en oracle y establecer la conexion.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param context contexto asosiacion a los procedimientos almacenados.
     */
    public EmpleadoRepositorio(EmpleadoContext context) {
        super(context);
    }

    /**
     * Metodo que registra a un empleado en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param empleadoDto objeto de tipo empleado para registrar en la base de datos.
     */
    @Override
    public void guardarEmpleado(EmpleadoDto empleadoDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_ESTADO_EMPLEADO_ID", empleadoDto.getEstadoEmpleadoId());
        params.put("V_PERSONA_ID", empleadoDto.getPersonaId());
        params.put("V_SUCURSAL_ID", empleadoDto.getSucursalId());
        params.put("V_TIPO_EMPLEADO_ID", empleadoDto.getTipoEmpleadoId());
        execute("PRC_INS_EMPLEADO", params);
    }

    /**
     * Metodo que registra a un empleado en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param empleadoDto objecto de tipo empleado para editar en la base de datos.
     */
    @Override
    public void editarEmpleado(EmpleadoDto empleadoDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_EMPLEADO_ID", empleadoDto.getId());
        params.put("V_TIPO_EMPLEADO_ID", empleadoDto.getTipoEmpleadoId());
        params.put("V_PERSONA_ID", empleadoDto.getPersonaId());
        params.put("V_SUCURSAL_ID", empleadoDto.getSucursalId());
        execute("PRC_UDT_EMPLEADO", params);
    }

    /**
     * Metodo que elimina a un empleado en la base de datos.
     * Llama al procedimiento almacenado PRC_DEL_EMPLEADO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param empleadoId       variable que contiene el id del empleado.
     * @param estadoEmpleadoId variable que contiene el id del estado del empleado.
     */
    @Override
    public void eliminarEmpleado(Integer empleadoId, Integer estadoEmpleadoId) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_EMPLEADO_ID", empleadoId);
        params.put("V_ESTADO_EMPLEADO_ID", estadoEmpleadoId);
        execute("PRC_DEL_EMPLEADO", params);
    }

    /**
     * Metodo un listado de todos los empleados con todas las columnas.
     * Llama al procedimiento almacenado PRC_LISTAR_CLIENTES
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @return retorna el todos los campos del empleado.
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<EmpleadoCustomDto> obtenerTodosLosEmpleados() {
        return (List<EmpleadoCustomDto>) executeList(EmpleadoCustomDto.class, "PRC_LISTAR_EMPLEADOS");
    }

}
