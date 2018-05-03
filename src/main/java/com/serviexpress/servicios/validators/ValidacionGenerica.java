package com.serviexpress.servicios.validators;

import java.util.function.Predicate;

public class ValidacionGenerica<K> implements Validacion<K> {
    private Predicate<K> predicate;

    private ValidacionGenerica(Predicate<K> predicate) {
        this.predicate = predicate;
    }

    public static <K> ValidacionGenerica<K> from(Predicate<K> predicate) {
        return new ValidacionGenerica<K>(predicate);
    }

    @Override
    public ResultadoGenerico test(K param) {
        return predicate.test(param) ? ResultadoGenerico.ok() : ResultadoGenerico.fail();
    }

}
