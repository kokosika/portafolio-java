package com.serviexpress.servicios.servicios.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.ReservaHoraDto;
import com.serviexpress.dto.custom.ServicioPorDiagnosticoDto;
import com.serviexpress.repositorios.interfaces.common.IReservaHoraRepositorio;
import com.serviexpress.servicios.interfaces.common.IReservaHoraService;
import com.serviexpress.servicios.servicios.BaseServicios;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReservaHoraService extends BaseServicios implements IReservaHoraService {

    private IReservaHoraRepositorio reservaHoraRepositorio;

    public ReservaHoraService(IReservaHoraRepositorio reservaHoraRepositorio) {
        this.reservaHoraRepositorio = reservaHoraRepositorio;
    }

    public ResponseEntity<GenericResponse> guardarReservaHora(ReservaHoraDto reservaHora) {
        try {
            return ok(this.reservaHoraRepositorio.guardarReservaHora(reservaHora));
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    public ResponseEntity<GenericResponse> guardarServicioPorDiagnostico(ServicioPorDiagnosticoDto servicioPorDiagnostico) {
        try {
            this.reservaHoraRepositorio.guardarServicioPorDiagnostico(servicioPorDiagnostico);
            return ok("Servicios guardados con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    public ResponseEntity<GenericResponse> getReservasCliente(String nombreUsuario) {
        try {
            return ok(this.reservaHoraRepositorio.getReservasCliente(nombreUsuario));
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    public ResponseEntity<GenericResponse> getDetalleServicio(Integer idDiagnostico) {
        try {
            return ok(this.reservaHoraRepositorio.getDetalleServicios(idDiagnostico));
        } catch (Exception ex) {
            return customException(ex);
        }
    }
}
