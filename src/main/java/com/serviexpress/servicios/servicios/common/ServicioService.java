package com.serviexpress.servicios.servicios.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.repositorios.interfaces.common.IServicioRepositorio;
import com.serviexpress.servicios.interfaces.common.IServicioService;
import com.serviexpress.servicios.servicios.BaseServicios;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServicioService extends BaseServicios implements IServicioService {

    private IServicioRepositorio servicioRepositorio;

    public ServicioService(IServicioRepositorio servicioRepositorio) {
        this.servicioRepositorio = servicioRepositorio;
    }

    public ResponseEntity<GenericResponse> getTodosLosServicios() {
        try {
            return ok(this.servicioRepositorio.getTodosLosServicios());
        } catch (Exception ex) {
            return customException(ex);
        }
    }

}
