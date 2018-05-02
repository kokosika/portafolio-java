package com.serviexpress.servicios.servicios.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.UsuarioDto;
import com.serviexpress.repositorios.interfaces.common.IUsuarioRepositorio;
import com.serviexpress.servicios.interfaces.common.IUsuarioService;
import com.serviexpress.servicios.servicios.BaseServicios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Clase base para la generacion de servicios de los usuarios dentro del sistema.
 * Hereda de la clase BaseSerivicios que contiene logica asociada a la respuesta de los
 * metodos hacia el cliente.
 * Extiende de la clase IUsuarioService que contiene la declaracion de todos los
 * metodos de la clase para su injeccion en las siguientes capas.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
@Service
public class UsuarioService extends BaseServicios implements IUsuarioService {

    /**
     * Injeccion de repositorio de usuarios para llamar a sus metodos de acceso a datos.
     */
    private IUsuarioRepositorio usuarioRepositorio;

    /**
     * Injeccion de repositorios dentro del servicio
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param usuarioRepositorio injeccion del repositorio IUsuarioRepositorio para la utilizacion de sus metodos.
     */
    public UsuarioService(IUsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    /**
     * Metodo que valida las credenciales del usuario, llama al metodo validacionLogin de
     * la capa repositorio
     * Envia una respuesta http con autorizado o no autorizado para su validacion en la capa cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objecto usuario para ser validado
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> validacionLogin(UsuarioDto dto) {
        try {
            if (this.usuarioRepositorio.validacionLogin(dto))
                return customResponse("Aceptado", "Aceptado", HttpStatus.ACCEPTED);
            else
                return customResponse("No Autorizado", "Error en las credenciales", HttpStatus.UNAUTHORIZED);
        } catch (Exception e) {
            return customException(e);
        }
    }

    /**
     * Metodo que envia un usuario para ser guardado en la base de datos
     * llama al metodo guardarUsuario de la capa repositorio
     * Envia una respuesta http con la insersion del usuario a la capa cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objecto usuario para ser enviado a la capa datos
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> guardarUsuario(UsuarioDto dto) {
        try {
            this.usuarioRepositorio.guardarUsuario(dto);
            return ok("Exito", "Usuario guardado con exito");
        } catch (Exception e) {
            return customException(e);
        }
    }

    /**
     * Metodo que envia un usuario para ser modificado en la base de datos
     * llama al metodo editarUsuario de la capa repositorio
     * Envia una respuesta http con la modificacion del usuario
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objecto usuario para ser enviado a la capa datos
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> editarUsuario(UsuarioDto dto) {
        try {
            this.usuarioRepositorio.editarUsuario(dto);
            return ok("Exito", "Usuario editado con exito");
        } catch (Exception e) {
            return customException(e);
        }
    }

    /**
     * Metodo que envia un usuario para ser eliminado en la base de datos
     * llama al metodo eliminarUsuario de la capa repositorio
     * Envia una respuesta http con la elimacion del usuario
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param usuarioId id del usuario
     * @param estadoUsuarioId id del estado del usuario
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> eliminarUsuario(Integer usuarioId, Integer estadoUsuarioId) {
        try {
            this.usuarioRepositorio.eliminarUsuario(usuarioId, estadoUsuarioId);
            return ok("Exito", "Usuario eliminado con exito");
        } catch (Exception e) {
            return customException(e);
        }
    }

}
