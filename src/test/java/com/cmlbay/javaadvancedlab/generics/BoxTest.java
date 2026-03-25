package com.cmlbay.javaadvancedlab.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Class description here.
 *
 * Generic Class Example
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-25
 */
public class BoxTest {

    /** Learns that a generic class can safely store and return a specific type. */
    @Test
    void box_shouldStoreAndReturnStringValue() {
        Box<String> box = new Box("Cemal");
        assertEquals("Cemal", box.getValue());
    }

    @Test
    /** Learns that the same generic class can work with another type. */
    void box_shouldStoreAndReturnIntegerValue() {
        Box<Integer> box = new Box<>(34);
        assertEquals(34, box.getValue());
    }
}
