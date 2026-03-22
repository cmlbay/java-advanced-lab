package com.cmlbay.javaadvancedlab.collections;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-22
 *
 * Set:
 * A Set does not allow duplicate elements.
 * In other words, it stores only unique values.
 * Example: [A][B][A][C] is not allowed, the result becomes something like [A][B][C].
 * It does not have an index-based structure.
 * Unlike a List, it does not work with the idea of "get the 3rd element".
 *
 * HashSet:
 * It is like a box system where order does not matter.
 * It stores elements by checking uniqueness, but it does not preserve insertion order.
 * It is suitable for very fast add, remove, and search operations.
 * However, the order of elements is not guaranteed.
 * Example: even if you add A, C, B, they may appear in a different order.
 *
 * LinkedHashSet:
 * It is similar to HashSet and still does not allow duplicate elements.
 * The difference is that it preserves insertion order.
 * So if you add A, C, B, iteration will return A, C, B in that same order.
 * It is useful when we want uniqueness and also want to keep insertion order.
 *
 * TreeSet:
 * It is a Set implementation that keeps elements sorted.
 * It does not allow duplicate elements.
 * It stores elements according to their natural order
 * or according to a provided comparator.
 * Example: if you add C, A, B, the result becomes A, B, C.
 * Since it performs sorting, it is generally more costly
 * than HashSet and LinkedHashSet.
 *
 * Main differences:
 * HashSet       -> Prevents duplicates, does not guarantee order.
 * LinkedHashSet -> Prevents duplicates, preserves insertion order.
 * TreeSet       -> Prevents duplicates, keeps elements sorted.
 */
public class SetExampleTest {
    private final SetExample setExample = new SetExample();

    @Test
    /** Learns that a Set does not store duplicate elements.*/
    void hashSet_shouldNotAllowDuplicates() {
        Set<String> names = setExample.createHashSetExample();

        assertEquals(2, names.size());
        assertTrue(names.contains("Ali"));
        assertTrue(names.contains("Veli"));
    }

    @Test
    /** Learns that LinkedHashSet preserves insertion order while preventing duplicates. */
    void linkedHashSet_shouldPreserveInsertionOrder_andNotAllowDuplicates() {
        Set<String> cities = setExample.createLinkedHashSetExample();

        assertEquals(List.of("Istanbul", "Ankara", "Izmir"), List.copyOf(cities));
    }

    @Test
    /** Learns that TreeSet keeps elements sorted and unique. */
    void treeSet_shouldKeepElementsSorted_andUnique() {
        Set<String> codes = setExample.createTreeSetExample();

        assertEquals(List.of("E120", "L300", "T250"), List.copyOf(codes));
    }

    @Test
    /** Learns that Set can check whether a given element exists. */
    void containsElement_shouldReturnTrue_whenValueExists() {
        Set<String> items = new HashSet<>();
        items.add("ADMIN");
        items.add("USER");

        boolean result = setExample.containsElementInSet(items, "ADMIN");

        assertTrue(result);
    }

    @Test
    /** Learns that adding an existing value to a Set returns false. */
    void addElement_shouldReturnFalse_whenValueAlreadyExists() {
        Set<String> items = new HashSet<>();
        items.add("ADMIN");

        boolean result = setExample.addElementToSet(items, "ADMIN");

        assertFalse(result);
        assertEquals(1, items.size());
    }

    @Test
    /** Learns that removing an existing element from a Set returns true. */
    void removeElement_shouldReturnTrue_whenValueExists() {
        Set<String> items = new HashSet<>();
        items.add("ADMIN");
        items.add("USER");

        boolean result = setExample.removeElementFromSet(items, "USER");

        assertTrue(result);
        assertFalse(items.contains("USER"));
        assertEquals(1, items.size());
    }

}
