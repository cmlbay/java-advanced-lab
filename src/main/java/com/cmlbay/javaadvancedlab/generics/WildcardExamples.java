package com.cmlbay.javaadvancedlab.generics;

import java.util.List;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-25
 */
public class WildcardExamples {

    public double sumNumbers(List<? extends Number> numbers) {
        return numbers.stream()
                .mapToDouble(Number::doubleValue)
                .sum();
    }
}
