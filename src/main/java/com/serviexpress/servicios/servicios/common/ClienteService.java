package com.serviexpress.servicios.servicios.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.ClienteDto;
import com.serviexpress.dto.custom.PersonaDto;
import com.serviexpress.dto.util.ErrorEnCamposDto;
import com.serviexpress.repositorios.interfaces.common.IClienteRepositorio;
import com.serviexpress.servicios.interfaces.common.IClienteService;
import com.serviexpress.servicios.servicios.BaseServicios;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Clase base para la generacion de servicios de los clientes dentro del sistema.
 * Hereda de la clase BaseSerivicios que contiene logica asociada a la respuesta de los
 * metodos hacia el cliente.
 * Extiende de la clase IClienteService que contiene la declaracion de todos los
 * metodos de la clase para su injeccion en las siguientes capas.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
@Service
public class ClienteService extends BaseServicios implements IClienteService {

    /**
     * Injeccion de repositorio de clientes para llamar a sus metodos de acceso a datos.
     */
    private IClienteRepositorio clienteRepositorio;

    /**
     * Injeccion de repositorios dentro del servicio
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param clienteRepositorio injeccion del repositorio IClienteRepositorio para la utilizacion de sus metodos.
     */
    public ClienteService(IClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    /**
     * Metodo que llama al metodo guardarCliente de la interfaz IClienteRepositorio para almacenar datos
     * del cliente.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo cliente que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> guardarCliente(ClienteDto dto) {
        ArrayList<ErrorEnCamposDto> errores = new ArrayList<ErrorEnCamposDto>();
        if (dto.getPersonaId() == 0 || dto.getPersonaId() == null)
            errores.add(new ErrorEnCamposDto("1", "id de la persona", "El id de la persona no puede ser null"));
        if (dto.getEstadoClienteId() == 0 || dto.getEstadoClienteId() == null)
            errores.add(new ErrorEnCamposDto("2", "id del estado del cliente", "El id del estado del cliente no puede ser null"));
        if (dto.getSucursalId() == 0 || dto.getSucursalId() == null)
            errores.add(new ErrorEnCamposDto("3", "id de la sucursal", "El id de la sucursal no puede ser vacio o null"));
        if (!errores.isEmpty()) {
            return error("Errores", errores);
        }
        try {
            this.clienteRepositorio.guardarCliente(dto);
            return ok("Exito", "El cliente fue registrado con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que llama al metodo editarCliente de la interfaz IClienteRepositorio para modificar datos
     * del cliente.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo cliente que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> editarCliente(ClienteDto dto) {
        try {
            this.clienteRepositorio.editarCliente(dto);
            return ok("Exito", "El cliente fue modificado con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que llama al metodo eliminarCliente de la interfaz IClienteRepositorio para eliminar datos
     * del cliente.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param clienteId       id del cliente.
     * @param estadoClienteId id del estado del cliente.
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> eliminarCliente(Integer clienteId, Integer estadoClienteId) {
        ArrayList<ErrorEnCamposDto> errores = new ArrayList<ErrorEnCamposDto>();
        if (clienteId == 0 || clienteId == null)
            errores.add(new ErrorEnCamposDto("1", "Id de cliente", "El id del cliente no puede ser null"));
        if (estadoClienteId == 0 || estadoClienteId == null)
            errores.add(new ErrorEnCamposDto("2", "id del estado del cliente", "El id del estado del cliente no puede ser null"));
        if (!errores.isEmpty()) {
            return error("Errores", errores);
        }
        try {
            this.clienteRepositorio.eliminarCliente(clienteId, estadoClienteId);
            return ok("Exito", "El cliente fue eliminado con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que llama al metodo buscarClientePorRut de la interfaz IClienteRepositorio para traer
     * el id del cliente de la base de datos.
     * Envia una respuesta http para la busqueda.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param personaDto objeto de tipo persona que sera enviado como filtro de la consulta
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> buscarClientePorRut(PersonaDto personaDto) {
        ArrayList<ErrorEnCamposDto> errores = new ArrayList<ErrorEnCamposDto>();
        if (personaDto.getNumId() == 0 || personaDto.getNumId() == null || personaDto.getDivId().isEmpty() || personaDto.getDivId() == null)
            errores.add(new ErrorEnCamposDto("1", "Campo rut", "El campo rut no puede ser null o estar vacio"));
        if (!errores.isEmpty()) {
            return error("Errores", errores);
        }
        try {
            return ok(this.clienteRepositorio.buscarClientePorRut(personaDto));
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que llama al metodo obtenerTodosLosClientes de la interfaz IClienteRepositorio para traer
     * todos los clientes de la base de datos.
     * Envia una respuesta http para la busqueda.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> obtenerTodosLosClientes() {
        try {
            return ok(this.clienteRepositorio.obtenerTodosLosClientes());
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    public ResponseEntity<GenericResponse> buscarClientePorId(String nombre) {
        try {
            if (nombre == null) {
                throw new Exception("El id no puede ser null");
            }
            return ok(this.clienteRepositorio.buscarClientePorId(nombre));
        } catch (Exception ex) {
            return customException(ex);
        }
    }

}
