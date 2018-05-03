package com.serviexpress.servicios.validators;

@FunctionalInterface
public interface Validacion<K> {

    ResultadoGenerico test(K param);

    default Validacion<K> and(Validacion<K> other) {
        return (param) -> {
            ResultadoGenerico result = this.test(param);
            return !result.isValid() ? result : other.test(param);
        };
    }

    default Validacion<K> or(Validacion<K> other) {
        return (param) -> {
            ResultadoGenerico result = this.test(param);
            return result.isValid() ? result : other.test(param);
        };
    }
}
