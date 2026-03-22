package com.cmlbay.javaadvancedlab.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-19
 *
 *
 >>> ArrayList <<<
 *  It is like a resizable array. [A][B][C][][]
 *  Elements are stored sequentially in memory.
 *  Access by index is efficient because it works by moving a certain number of steps
    from the beginning to reach the element.
 *  Inserting or removing elements in the middle is costly.
    Example: [A][B][C] -> insert X -> [A][X][B][C]
    In this case, B and C must be shifted.

 >>> LinkedList <<<
 *  It is like a chain of connected boxes.
 *  Each element knows the next one. [A]->[B]->[C]
 *  If we already know the position of a node, inserting an element in between is easy.
      Example: [A]->[B]->[C] --> insert X --> [A]->[X]->[B]->[C]
 * Access by index is inefficient.
    For example, to reach the 2nd element, we must first visit
    the 0th element, then the 1st element, and finally the 2nd element.
 *
 */
public class ListExampleTest {
    private final ListExample listExamples = new ListExample();

    /** Learns that a List preserves insertion order and allows duplicate elements. */
    @Test
    void arrayList_shouldAllowDuplicates_andPreserveOrder() {
        List<String> names = listExamples.createArrayListExample();

        assertEquals(3, names.size());
        assertEquals("Ali", names.get(0));
        assertEquals("Burak", names.get(1));
        assertEquals("Ali", names.get(2));
    }

    /** Learns that LinkedList also follows List behavior such as ordering and duplicates. */
    @Test
    void linkedList_shouldAlsoAllowDuplicates_andPreserveOrder() {
        List<String> cities = listExamples.createLinkedListExample();

        assertEquals(3, cities.size());
        assertEquals("İstanbul", cities.get(0));
        assertEquals("Konya", cities.get(1));
        assertEquals("Bilecik", cities.get(2));
    }

    /** Learns that List provides index-based access to elements */
    @Test
    void getSecondElement_shouldReturnItemAtIndexOne() {
        List<String> items = List.of("A", "B", "C");
        String result = listExamples.getSecondElement(items);
        assertEquals("B", result);
    }

    /** Learns that a List can insert an element at a specific index without replacing others */
    @Test
    void addElementAtIndex_shouldInsertValueWithoutRemovingExistingOnes() {
        List<String> items = new ArrayList<>(List.of("A", "C"));
        listExamples.addElementAtIndex(items, 1, "B");
        assertEquals(List.of("A", "B", "C"), items);
    }

    /** Learns that a List supports updating an element at a specific index. */
    void set_shouldReplaceElementAtGivenIndex(){
        List<String> items = new ArrayList<>(List.of("A", "B", "C"));
        items.set(1,"X");

        assertEquals(List.of("A", "X", "C"), items);
    }

    /** Learns that a List can check whether it contains a given element. */
    void contains_shouldReturnTrueWhenElementExistsInList(){
        List<String> items = List.of("A", "B", "C");
        assertTrue(items.contains("B"));
    }
}
