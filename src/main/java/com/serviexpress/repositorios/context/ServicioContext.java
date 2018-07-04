package com.serviexpress.repositorios.context;

import org.springframework.stereotype.Component;

@Component
public class ServicioContext extends BaseContext {

    public ServicioContext() {
        super("PKG_SERVICIOS");
    }
}
