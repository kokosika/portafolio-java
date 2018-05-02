package com.serviexpress.api.rest.common;

import com.serviexpress.api.rest.BaseRest;
import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.UsuarioDto;
import com.serviexpress.servicios.interfaces.common.IUsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.serviexpress.config.ApiPathConfig.PATH;

/**
 * Clase que almacena la base de los servicios de los usuarios.
 * Hereda de la clase BaseRest que contiene logica encapsulada.
 * <p>
 * 1.0 Franco Cortez - Version incial.
 */
@RestController
@RequestMapping(value = PATH + "usuario")
public class UsuarioRestController extends BaseRest {

    /**
     * Injeccion de la capa servicios con el bean IUsuarioService
     */
    private IUsuarioService usuarioService;

    /**
     * Injeccion de repositorios dentro del controlador
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param usuarioService injeccion del repositorio IUsuarioService para la utilizacion de sus metodos.
     */
    public UsuarioRestController(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    /**
     * Metodo post que retorna al metodo validacionLogin de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para validar las credenciales de un usuario.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta al cliente.
     */
    @PostMapping(value = "validacion-login")
    public ResponseEntity<GenericResponse> validacionLogin(@RequestBody UsuarioDto dto) {
        return this.usuarioService.validacionLogin(dto);
    }

    /**
     * Metodo post que retorna al metodo guardarUsuario de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para insertar un nuevo usuario.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo usuario que sera enviado para su almacenamiento en la base de datos.
     * @return retorna una respuesta al cliente.
     */
    @PostMapping
    public ResponseEntity<GenericResponse> guardarUsuario(@RequestBody UsuarioDto dto) {
        return this.usuarioService.guardarUsuario(dto);
    }

    /**
     * Metodo put que retorna al metodo editarUsuario de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para modificar usuario.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta al cliente.
     */
    @PutMapping
    public ResponseEntity<GenericResponse> editarUsuario(@RequestBody UsuarioDto dto) {
        return this.usuarioService.editarUsuario(dto);
    }

    /**
     * Metodo delete que retorna al metodo eliminarUsuario de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para eliminar usuario.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param usuarioId id del usuario
     * @param estadoUsuarioId id del estado del usuario.
     * @return retorna una respuesta al cliente.
     */
    @DeleteMapping
    public ResponseEntity<GenericResponse> eliminarUsuario(Integer usuarioId, Integer estadoUsuarioId) {
        return this.usuarioService.eliminarUsuario(usuarioId, estadoUsuarioId);
    }
}
