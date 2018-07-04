package com.serviexpress.repositorios.repositorios.common;

import com.serviexpress.dto.common.ServicioCustomDto;
import com.serviexpress.repositorios.context.ServicioContext;
import com.serviexpress.repositorios.interfaces.common.IServicioRepositorio;
import com.serviexpress.repositorios.repositorios.BaseRepositorio;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@EnableAutoConfiguration
@Transactional
public class ServicioRepositorio extends BaseRepositorio<ServicioContext> implements IServicioRepositorio {

    public ServicioRepositorio(ServicioContext context) {
        super(context);
    }

    @SuppressWarnings("unchecked")
    public List<ServicioCustomDto> getTodosLosServicios() {
        return (List<ServicioCustomDto>) executeList(ServicioCustomDto.class, "PRC_GET_TODOS_LOS_SERVICIOS");
    }
}
