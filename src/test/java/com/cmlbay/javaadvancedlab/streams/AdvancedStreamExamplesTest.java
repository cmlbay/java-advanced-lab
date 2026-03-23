package com.cmlbay.javaadvancedlab.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-23
 */
public class AdvancedStreamExamplesTest {
    private final AdvancedStreamExamples examples = new AdvancedStreamExamples();

    @Test
    /** Learns that sorted orders stream elements alphabetically. */
    void sortNamesAlphabetically_shouldReturnSortedNames() {
        List<String> result = examples.sortNamesAlphabetically(
                List.of("Veli", "Ali", "Ayşe")
        );

        assertEquals(List.of("Ali", "Ayşe", "Veli"), result);
    }

    @Test
    /** Learns that distinct removes duplicate elements. */
    void getDistinctNames_shouldRemoveDuplicateValues() {
        List<String> result = examples.getDistinctNames(
                List.of("Ali", "Ali", "Veli", "Ali")
        );

        assertEquals(List.of("Ali", "Veli"), result);
    }

    @Test
    /** Learns that findFirst returns the first matching element wrapped in Optional. */
    void findFirstNameStartingWithA_shouldReturnFirstMatchingName() {
        Optional<String> result = examples.findFirstNameStartingWithA(
                List.of("Veli", "Ayşe", "Ali")
        );

        assertTrue(result.isPresent());
        assertEquals("Ayşe", result.get());
    }

    @Test
    /** Learns that anyMatch checks whether at least one element matches the condition. */
    void hasAnyNameStartingWithA_shouldReturnTrue_whenAtLeastOneNameMatches() {
        boolean result = examples.hasAnyNameStartingWithA(
                List.of("Veli", "Ali", "Mehmet")
        );

        assertTrue(result);
    }

    @Test
    /** Learns that allMatch checks whether all elements satisfy the condition. */
    void areAllNamesLongerThanTwo_shouldReturnTrue_whenAllNamesMatch() {
        boolean result = examples.areAllNamesLongerThanTwo(
                List.of("Ali", "Veli", "Ayşe")
        );

        assertTrue(result);
    }

    @Test
    /** Learns that limit keeps only the first N elements. */
    void getFirstTwoNames_shouldReturnOnlyFirstTwoElements() {
        List<String> result = examples.getFirstTwoNames(
                List.of("Ali", "Ayşe", "Veli", "Ahmet")
        );

        assertEquals(List.of("Ali", "Ayşe"), result);
    }

    @Test
    /** Learns that skip ignores the first N elements. */
    void skipFirstTwoNames_shouldReturnRemainingElements() {
        List<String> result = examples.skipFirstTwoNames(
                List.of("Ali", "Ayşe", "Veli", "Ahmet")
        );

        assertEquals(List.of("Veli", "Ahmet"), result);
    }
}
