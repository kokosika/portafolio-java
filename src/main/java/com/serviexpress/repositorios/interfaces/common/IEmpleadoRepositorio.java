package com.serviexpress.repositorios.interfaces.common;

import com.serviexpress.dto.common.EmpleadoCustomDto;
import com.serviexpress.dto.custom.EmpleadoDto;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;

import java.util.List;

/**
 * Interface base de la logica de empleado dentro de la aplicacion.
 * Hereda de la interfaz IBaseRepositorio para obtener declaraciones especificas para
 * su funcionamiento.
 * <p>
 * 1.0 Franco Cortez - Version Inicial.
 */
public interface IEmpleadoRepositorio extends IBaseRepositorio {

    /**
     * Metodo que registra a un empleado en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param empleadoDto objeto de tipo empleado para registrar en la base de datos.
     */
    public void guardarEmpleado(EmpleadoDto empleadoDto);

    /**
     * Metodo que registra a un empleado en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param empleadoDto objecto de tipo empleado para editar en la base de datos.
     */
    public void editarEmpleado(EmpleadoDto empleadoDto);

    /**
     * Metodo que registra a un empleado en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param empleadoId
     * @param estadoEmpleadoId
     */
    public void eliminarEmpleado(Integer empleadoId, Integer estadoEmpleadoId);

    /**
     * Metodo un listado de todos los empleados con todas las columnas.
     * Llama al procedimiento almacenado PRC_LISTAR_CLIENTES
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @return retorna el todos los campos del empleado.
     */
    public List<EmpleadoCustomDto> obtenerTodosLosEmpleados();


}
