package com.cmlbay.javaadvancedlab.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-23
 */
public class StreamExamplesTest {
    private final StreamExamples streamExamples = new StreamExamples();

    @Test
    /** Learns that filter selects only elements matching a condition. */
    void filterNamesStartingWithA_shouldReturnOnlyMatchingNames(){
        List<String> filteredNames = streamExamples
                .filterNamesStartingWithA(List.of("Ahmet", "Cemal","Ali"));

        assertEquals(List.of("Ahmet","Ali"), filteredNames);
    }

    @Test
    /** Learns that map transforms each element into another form. */
    void convertNamesToUpperCase_shouldTransformAllNames(){
        List<String> convertedNames = streamExamples
                .convertNamesToUpperCase(List.of("Cemal", "Ali"));

        assertEquals(List.of("CEMAL","ALİ"), convertedNames);
    }

    @Test
    /** Learns that filter and map can be chained in a single stream pipeline. */
    void filterAndConvertToUpperCase_shouldApplyMultipleOperationsInOrder(){
        List<String> result = streamExamples
                .filterLongerThanFourAndConvertToUpperCase(List.of("Cemal", "Ali"));

        assertEquals(List.of("CEMAL"),result);
    }

    @Test
    /** Learns that count returns the number of matching elements. */
    void countNamesLongerThanFour_shouldReturnMatchingElementCount(){
        long result = streamExamples.countNamesLongerThanFour(List.of("Ali", "Cemal", "Ahmet", "Burak"));
        assertEquals(3, result);
    }
}
