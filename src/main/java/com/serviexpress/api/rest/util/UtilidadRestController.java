package com.serviexpress.api.rest.util;

import com.serviexpress.api.rest.BaseRest;
import com.serviexpress.dto.GenericResponse;
import com.serviexpress.servicios.interfaces.util.IUtilidadServicios;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.serviexpress.config.ApiPathConfig.PATH;

@RestController
@RequestMapping(value = PATH + "utilidad")
public class UtilidadRestController extends BaseRest {

    /**
     * Injeccion de la capa servicios con el bean IUtilidadServicios
     */
    private IUtilidadServicios utilidadServicios;

    /**
     * Injeccion de repositorios dentro del controlador
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param utilidadServicios injeccion del repositorio IUtilidadServicios para la utilizacion de sus metodos.
     */
    public UtilidadRestController(IUtilidadServicios utilidadServicios) {
        this.utilidadServicios = utilidadServicios;
    }

    /**
     * Metodo que llama al metodo getRadioEstadoCliente de la Interface IUtilidadServicios.
     * Genera una respuesta tipo json.
     *
     * @return respuesta al cliente.
     */
    @GetMapping(value = "/radio-tipo-cliente")
    public ResponseEntity<GenericResponse> getRadioEstadoCliente() {
        return this.utilidadServicios.getRadioEstadoCliente();
    }

    /**
     * Metodo que llama al metodo getRadioEstadoProveedor de la Interface IUtilidadServicios.
     * Genera una respuesta tipo json.
     *
     * @return respuesta al cliente.
     */
    @GetMapping(value = "/radio-estado-proveedor")
    public ResponseEntity<GenericResponse> getRadioEstadoProveedor() {
        return this.utilidadServicios.getRadioEstadoProveedor();
    }

    /**
     * Metodo que llama al metodo getRadioTipoProveedor de la Interface IUtilidadServicios.
     * Genera una respuesta tipo json.
     *
     * @return respuesta al cliente.
     */
    @GetMapping(value = "/radio-tipo-proveedor")
    public ResponseEntity<GenericResponse> getRadioTipoProveedor() {
        return this.utilidadServicios.getRadioTipoProveedor();
    }

    /**
     * Metodo que llama al metodo getRadioEstadoEmpleado de la Interface IUtilidadServicios.
     * Genera una respuesta tipo json.
     *
     * @return respuesta al cliente.
     */
    @GetMapping(value = "/radio-estado-empleado")
    public ResponseEntity<GenericResponse> getRadioEstadoEmpleado() {
        return this.utilidadServicios.getRadioEstadoEmpleado();
    }

    /**
     * Metodo que llama al metodo getRadioTipoEmpleado de la Interface IUtilidadServicios.
     * Genera una respuesta tipo json.
     *
     * @return respuesta al cliente.
     */
    @GetMapping(value = "/radio-tipo-empleado")
    public ResponseEntity<GenericResponse> getRadioTipoEmpleado() {
        return this.utilidadServicios.getRadioTipoEmpleado();
    }
}
