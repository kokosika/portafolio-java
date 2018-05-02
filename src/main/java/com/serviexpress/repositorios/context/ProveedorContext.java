package com.serviexpress.repositorios.context;

import org.springframework.stereotype.Component;

/**
 * Contexto base para el proveedor y sus funcionalidades dentro de la aplicacion.
 * Hereda de la clase BaseContext para obtener una relacion con los repositorios
 * de datos.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
@Component
public class ProveedorContext extends BaseContext {
    /**
     * Constructor para inicializar el contexto de datos para oracle
     * ayuda al base repositorio identificar el package que esta utilizando
     * y llamar de forma correcta el procedimiento o funcion almacenada.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     */
    public ProveedorContext() {
        super("PKG_PROVEEDORES");
    }
}
