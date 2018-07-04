package com.serviexpress.servicios.interfaces.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.ReservaHoraDto;
import com.serviexpress.dto.custom.ServicioPorDiagnosticoDto;
import com.serviexpress.servicios.interfaces.IBaseServicios;
import org.springframework.http.ResponseEntity;


public interface IReservaHoraService extends IBaseServicios {
    public ResponseEntity<GenericResponse> guardarReservaHora(ReservaHoraDto reservaHora);

    public ResponseEntity<GenericResponse> guardarServicioPorDiagnostico(ServicioPorDiagnosticoDto servicioPorDiagnostico);

    public ResponseEntity<GenericResponse> getReservasCliente(String nombreUsuario);

    public ResponseEntity<GenericResponse> getDetalleServicio(Integer idDiagnostico);
}
