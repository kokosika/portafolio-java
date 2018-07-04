package com.serviexpress.api.rest.common;

import com.serviexpress.api.rest.BaseRest;
import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.ReservaHoraDto;
import com.serviexpress.dto.custom.ServicioPorDiagnosticoDto;
import com.serviexpress.servicios.interfaces.common.IReservaHoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.serviexpress.config.ApiPathConfig.PATH;

/**
 * Clase que almacena la base de los servicios de los clientes.
 * Hereda de la clase BaseRest que contiene logica encapsulada.
 * <p>
 * 1.0 Franco Cortez - Version incial.
 */
@RestController
@RequestMapping(value = PATH + "reserva-hora")
public class ReservaHoraRestController extends BaseRest {

    private IReservaHoraService reservaHoraService;

    public ReservaHoraRestController(IReservaHoraService reservaHoraService) {
        this.reservaHoraService = reservaHoraService;
    }

    @PostMapping
    public ResponseEntity<GenericResponse> guardarReservaHora(@RequestBody ReservaHoraDto reservaHora) {
        return this.reservaHoraService.guardarReservaHora(reservaHora);
    }

    @PostMapping(value = "/servicios-diagnostico")
    public ResponseEntity<GenericResponse> guardarServicioPorDiagnostico(@RequestBody ServicioPorDiagnosticoDto servicioPorDiagnostico) {
        return this.reservaHoraService.guardarServicioPorDiagnostico(servicioPorDiagnostico);
    }

    @GetMapping
    public ResponseEntity<GenericResponse> getReservasCliente(String nombreUsuario) {
        return this.reservaHoraService.getReservasCliente(nombreUsuario);
    }

    @GetMapping(value = "/detalle-servicios")
    public ResponseEntity<GenericResponse> getDetalleServicios(Integer idDiagnostico) {
        return this.reservaHoraService.getDetalleServicio(idDiagnostico);
    }


}


