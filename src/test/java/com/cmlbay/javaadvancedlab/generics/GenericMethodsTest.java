package com.cmlbay.javaadvancedlab.generics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Class description here.
 *
 * Generic Method Example
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-25
 */
public class GenericMethodsTest {
    private final GenericMethods genericMethods = new GenericMethods();

    @Test
    /** Learns that a generic method can work with String values.*/
    void getFirst_shouldReturnFirstString() {
        String result = genericMethods.getFirstParam("A", "B");
        assertEquals("A", result);
    }

    @Test
    /** Learns that the same generic method can work with Integer values. */
    void getFirst_shouldReturnFirstInteger() {
        Integer result = genericMethods.getFirstParam(10, 20);
        assertEquals(10, result);
    }


}
