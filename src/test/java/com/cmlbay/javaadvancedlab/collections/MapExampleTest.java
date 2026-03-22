package com.cmlbay.javaadvancedlab.collections;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-22
 *
 *  Map:
 *   A Map stores data in a key-value structure.
 *   In other words, each value is associated with a key.
 *   Example: id -> Ahmet, 34 -> Istanbul, userId -> Cemal
 *
 *   It does not store only elements like a List.
 *   It also does not work only with uniqueness logic like a Set.
 *   Instead, each record consists of a key and its corresponding value.
 *
 *   The key must be unique.
 *   If the same key is added again, the old value is replaced.
 *   Example:
 *   101 -> Ahmet
 *   101 -> Mehmet
 *   As a result, the key is still 101, but the value becomes Mehmet.
 *
 *   The value can be duplicated.
 *   This means different keys may have the same value.
 *   Example:
 *   101 -> Istanbul
 *   102 -> Istanbul
 *
 *   A Map does not have an index-based structure.
 *   Unlike a List, it does not work with the idea of "get the 2nd element".
 *   Instead, it works with the idea of
 *   "get the value associated with this key".
 *
 *   HashMap:
 *   It is like a structure where order does not matter.
 *   It stores and searches data very quickly by key.
 *   Add, remove, and search operations are generally very fast.
 *   However, the order of elements is not guaranteed.
 *   So they may not appear in the same order in which they were inserted.
 *
 *   LinkedHashMap:
 *   It is similar to HashMap and still works with the key-value structure.
 *   The difference is that it preserves insertion order.
 *   So if you add entries in a certain order,
 *   iteration will usually return them in that same order.
 *   It is useful when we need a Map structure and also want to keep insertion order.
 *
 *   TreeMap:
 *   It is a Map implementation that keeps entries sorted by key.
 *   In other words, it stores records according to key order,
 *   not insertion order.
 *   Example:
 *   30 -> C
 *   10 -> A
 *   20 -> B
 *   When iterated, the result becomes:
 *   10 -> A
 *   20 -> B
 *   30 -> C
 *
 *   Since TreeMap performs sorting, it is generally more costly
 *   than HashMap and LinkedHashMap.
 *
 *   Main differences:
 *   HashMap       -> Stores key-value pairs, does not guarantee order.
 *   LinkedHashMap -> Stores key-value pairs, preserves insertion order.
 *   TreeMap       -> Stores key-value pairs, keeps entries sorted by key.
 *
 *   Important note:
 *   Keys in a Map are unique.
 *   If the same key is added again, a new record is not created;
 *   the old value is simply replaced.
 */
public class MapExampleTest {
    private final MapExample mapExamples = new MapExample();

    @Test
    /** Learns that Map stores data as key-value pairs and retrieves values by key.*/
    void getValue_shouldReturnValueBelongingToGivenKey() {
        Map<String, String> cities = mapExamples.createHashMapExample();

        String result = mapExamples.getValue(cities, "34");

        assertEquals("Istanbul", result);
    }

    @Test
    /** Learns that Map can check whether a specific key exists.*/
    void containsKey_shouldReturnTrue_whenKeyExists() {
        Map<String, String> cities = mapExamples.createHashMapExample();

        boolean result = mapExamples.containsKey(cities, "06");

        assertTrue(result);
    }

    @Test
    /** Learns that putting the same key again replaces the old value.*/
    void putValue_shouldReplaceOldValue_whenKeyAlreadyExists() {
        Map<String, String> cities = mapExamples.createHashMapExample();

        String oldValue = mapExamples.putValue(cities, "34", "Istanbul Updated");

        assertEquals("Istanbul", oldValue);
        assertEquals("Istanbul Updated", cities.get("34"));
        assertEquals(3, cities.size());
    }

    @Test
    /** Learns that removing a key returns its old value and deletes the entry.*/
    void removeKey_shouldReturnOldValue_andRemoveEntry() {
        Map<String, String> cities = mapExamples.createHashMapExample();

        String removedValue = mapExamples.removeKey(cities, "35");

        assertEquals("Izmir", removedValue);
        assertFalse(cities.containsKey("35"));
        assertEquals(2, cities.size());
    }

    @Test
    /** Learns that getOrDefault returns the fallback value when the key does not exist.*/
    void getOrDefaultValue_shouldReturnDefault_whenKeyDoesNotExist() {
        Map<String, String> cities = mapExamples.createHashMapExample();

        String result = mapExamples.getOrDefaultValue(cities, "99", "Unknown");

        assertEquals("Unknown", result);
    }

    @Test
    /** Learns that LinkedHashMap preserves insertion order.*/
    void linkedHashMap_shouldPreserveInsertionOrder() {
        Map<String, String> cities = mapExamples.createLinkedHashMapExample();

        assertEquals(List.of("34", "06", "35"), List.copyOf(cities.keySet()));
    }

    @Test
    /** Learns that TreeMap keeps keys sorted.*/
    void treeMap_shouldKeepKeysSorted() {
        Map<String, String> cities = mapExamples.createTreeMapExample();

        assertEquals(List.of("06", "34", "35"), List.copyOf(cities.keySet()));
    }
}
