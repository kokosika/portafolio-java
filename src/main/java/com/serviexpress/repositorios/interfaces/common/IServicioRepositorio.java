package com.serviexpress.repositorios.interfaces.common;

import com.serviexpress.dto.common.ServicioCustomDto;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;

import java.util.List;

public interface IServicioRepositorio extends IBaseRepositorio {

    public List<ServicioCustomDto> getTodosLosServicios();
}
