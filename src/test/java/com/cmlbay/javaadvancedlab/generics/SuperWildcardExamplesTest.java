package com.cmlbay.javaadvancedlab.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class description here.
 *
 * Lower bounded wildcard — ? super T
 *
 * The unknown type must be T or a supertype of T.
 * This form is mainly suitable for writing/consuming values.
 * You can safely add T values (and its subtypes in the assignment sense).
 * But when reading, you cannot safely assume the result is T; Object is the safe type.
 * Usage idea: “I write values into the target.”
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-25
 */
public class SuperWildcardExamplesTest {
    private final SuperWildcardExamples examples = new SuperWildcardExamples();

    @Test
    /** Learns that a lower bounded wildcard can write Integer values into a Number list. */
    void addDefaultIntegers_shouldAddValuesToNumberList() {
        List<Number> numbers = new ArrayList<>();

        examples.addDefaultIntegers(numbers);

        assertEquals(List.of(10, 20), numbers);
    }
}
