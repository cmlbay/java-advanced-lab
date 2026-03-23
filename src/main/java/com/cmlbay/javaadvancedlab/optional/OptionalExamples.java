package com.cmlbay.javaadvancedlab.optional;

import java.util.Optional;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-24
 */
public class OptionalExamples {

    public Optional<String> findNameById(Long id) {
        if (id == 1L) {
            return Optional.of("Cemal");
        }
        return Optional.empty();
    }

    public Optional<String> wrapNullableValue(String value) {
        return Optional.ofNullable(value);
    }

    public String getNameOrDefault(Optional<String> optionalName) {
        return optionalName.orElse("Unknown");
    }

    public String getNameOrThrow(Optional<String> optionalName) {
        return optionalName.orElseThrow(() -> new IllegalArgumentException("Name not found"));
    }

    public Optional<String> convertNameToUpperCase(Optional<String> optionalName) {
        return optionalName.map(String::toUpperCase);
    }

    public Optional<String> keepOnlyNamesStartingWithC(Optional<String> optionalName) {
        return optionalName.filter(name -> name.startsWith("C"));
    }

    public void validateOptionalOf(String value) {
        Optional.of(value);
    }
}
