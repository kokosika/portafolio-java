package com.serviexpress.servicios.interfaces.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.servicios.interfaces.IBaseServicios;
import org.springframework.http.ResponseEntity;


public interface IServicioService extends IBaseServicios {

    public ResponseEntity<GenericResponse> getTodosLosServicios();
}
