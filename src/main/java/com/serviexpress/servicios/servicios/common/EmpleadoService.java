package com.serviexpress.servicios.servicios.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.EmpleadoDto;
import com.serviexpress.dto.util.ErrorEnCamposDto;
import com.serviexpress.repositorios.interfaces.common.IEmpleadoRepositorio;
import com.serviexpress.servicios.interfaces.common.IEmpleadoService;
import com.serviexpress.servicios.servicios.BaseServicios;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Clase base para la generacion de servicios de los empleados dentro del sistema.
 * Hereda de la clase BaseSerivicios que contiene logica asociada a la respuesta de los
 * metodos hacia el cliente.
 * Extiende de la clase IEmpleadoService que contiene la declaracion de todos los
 * metodos de la clase para su injeccion en las siguientes capas.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
@Service
public class EmpleadoService extends BaseServicios implements IEmpleadoService {

    /**
     * Injeccion de repositorio de clientes para llamar a sus metodos de acceso a datos.
     */
    private IEmpleadoRepositorio empleadoRepositorio;

    /**
     * Injeccion de repositorios dentro del servicio
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param empleadoRepositorio injeccion del repositorio IEmpleadoRepositorio para la utilizacion de sus metodos.
     */
    public EmpleadoService(IEmpleadoRepositorio empleadoRepositorio) {
        this.empleadoRepositorio = empleadoRepositorio;
    }

    /**
     * Metodo que llama al metodo guardarEmpleado de la interfaz IEmpleadoRepositorio para almacenar datos
     * del cliente.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo empleado que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> guardarEmpleado(EmpleadoDto dto) {
        try {
            this.empleadoRepositorio.guardarEmpleado(dto);
            return ok("Exito", "El empleado fue registrado con exito");

        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que llama al metodo editarEmpleado de la interfaz IEmpleadoRepositorio para modificar datos
     * del cliente.
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo empleado que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> editarEmpleado(EmpleadoDto dto) {

        try {
            this.empleadoRepositorio.editarEmpleado(dto);
            return ok("Exito", "El empleado fue modificado con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que llama al metodo editarEmpleado de la interfaz IEmpleadoRepositorio para modificar datos
     * del cliente.
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param empleadoId       id del empleado
     * @param estadoEmpleadoId id del estado del empleado
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> eliminarEmpleado(Integer empleadoId, Integer estadoEmpleadoId) {
        ArrayList<ErrorEnCamposDto> errores = new ArrayList<ErrorEnCamposDto>();
        if (empleadoId == 0 || empleadoId == null)
            errores.add(new ErrorEnCamposDto("1", "id del empelado", "El id del empleado no puede ser null"));
        if (estadoEmpleadoId == 0 || estadoEmpleadoId == null)
            errores.add(new ErrorEnCamposDto("2", "id del estado del empleado", "El id del estado del empleado no puede ser null"));
        if (!errores.isEmpty())
            return error("Errores", errores);

        try {
            this.empleadoRepositorio.eliminarEmpleado(empleadoId, estadoEmpleadoId);
            return ok("Exito", "El empleado fue eliminado con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que llama al metodo obtenerTodosLosEmpleados de la interfaz IEmpleadoRepositorio para traer
     * todos los empleados de la base de datos.
     * Envia una respuesta http para la busqueda.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> obtenerTodosLosEmpleados() {
        try {
            return ok(this.empleadoRepositorio.obtenerTodosLosEmpleados());
        } catch (Exception ex) {
            return customException(ex);
        }
    }

}
