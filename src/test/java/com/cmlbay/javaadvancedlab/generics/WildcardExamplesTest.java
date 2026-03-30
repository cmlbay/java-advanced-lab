package com.cmlbay.javaadvancedlab.generics;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class description here.
 *
 * Upper bounded wildcard — ? extends T
 *
 * Upper bounded wildcard — ? extends T
 * The unknown type must be T or a subtype of T
 * Values can be safely read as T.
 * You generally cannot add new T values, because the exact subtype is unknown.
 * Usage idea: “I read values from the source.”
 *
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-25
 */
public class WildcardExamplesTest {
    private final WildcardExamples examples = new WildcardExamples();

    @Test
    /** Learns that an upper bounded wildcard can read from Integer lists. */
    void sumNumbers_shouldSupportIntegerList() {
        double result = examples.sumNumbers(List.of(1, 2, 3));

        assertEquals(6.0, result);
    }

    @Test
    /** Learns that an upper bounded wildcard can read from Double lists. */
    void sumNumbers_shouldSupportDoubleList() {
        double result = examples.sumNumbers(List.of(1.5, 2.5));

        assertEquals(4.0, result);
    }
}
