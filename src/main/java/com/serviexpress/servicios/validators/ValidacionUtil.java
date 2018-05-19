package com.serviexpress.servicios.validators;

import java.util.Objects;

public class ValidacionUtil {

    public static final Validacion<String> notNullString = ValidacionGenerica.from(Objects::nonNull);
    public static final Validacion<String> notEmptyString = ValidacionGenerica.from(s -> !s.isEmpty());
    public static final Validacion<Integer> notNullInteger = ValidacionGenerica.from(Objects::nonNull);
    public static final Validacion<Integer> greaterThanZero = ValidacionGenerica.from(s -> s > 0);

    public static Validacion<String> stringMoreThan(int size) {
        return ValidacionGenerica.from(s -> ((String) s).length() > size);
    }

    ;

    public static Validacion<String> stringLessThan(int size) {
        return ValidacionGenerica.from(s -> ((String) s).length() < size);
    }

    ;

    public static Validacion<String> stringBetween(int morethan, int lessThan) {
        return stringMoreThan(morethan).and(stringLessThan(lessThan));
    }

    ;

    public static Validacion<Integer> integerMoreThan(int limit) {
        return ValidacionGenerica.from(s -> s > limit);
    }

    ;

    public static Validacion<Integer> integerLessThan(int size) {
        return ValidacionGenerica.from(s -> s < size);
    }

    ;

    public static Validacion<Integer> integerBetween(int morethan, int lessThan) {
        return integerMoreThan(morethan).and(integerLessThan(lessThan));
    }

    ;

}
