package com.serviexpress.repositorios.context;

/**
 * Es la base de los contextos o en caso de oracle los packages.
 * Recive por parametro el nombre del package para su implementacion
 * en la llamada a los procedimientos y funciones almacenadas en el
 * package, en caso de ser oracle es obligatorio crear una clase heredada
 * de esta como su principal herencia, en caso de otra base de datos crear
 * un contexto vacio.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
public class BaseContext {

    /**
     * Variable que almacena el contexto de la aplicacion para mapearla
     * con los packages de oracle.
     */
    private String context;

    /**
     * Constructor para inicializar el contexto de datos para oracle
     * ayuda al base repositorio identificar el package que esta utilizando
     * y llamar de forma correcta el procedimiento o funcion almacenada.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param context nombre del contexto o package en oracle.
     */
    public BaseContext(String context) {
        this.setContext(context);
    }


    /**
     * @return el valor del contexto.
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context cambia el valor del contexto.
     */
    public void setContext(String context) {
        this.context = context;
    }
}
