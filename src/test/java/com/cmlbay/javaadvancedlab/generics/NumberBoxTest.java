package com.cmlbay.javaadvancedlab.generics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class description here.
 *
 * Bounded Type Parameter Example
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-25
 */
public class NumberBoxTest {

    /** Learns that bounded generics can work with numeric types. */
    @Test
    void numberBox_shouldSupportInteger(){
        NumberBox<Integer> box = new NumberBox<>(25);
        assertEquals(25,box.doubleValue());
    }

    @Test
    void numberBox_shouldSupportDouble(){
        NumberBox<Double> box = new NumberBox<>(12.5);
        assertEquals(12.5,box.doubleValue());
    }
}
