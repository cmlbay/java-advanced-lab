package com.cmlbay.javaadvancedlab.optional;

import org.junit.jupiter.api.Test;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-24
 */
public class OptionalExamplesTest {
    private final OptionalExamples examples = new OptionalExamples();

    @Test
    /** Learns that Optional can represent an existing value. */
    void findNameById_shouldReturnOptionalWithValue_whenIdExists() {
        Optional<String> result = examples.findNameById(1L);

        assertTrue(result.isPresent());
        assertEquals("Cemal", result.get());
    }

    @Test
    /** Learns that Optional can represent absence with Optional.empty(). */
    void findNameById_shouldReturnEmptyOptional_whenIdDoesNotExist() {
        Optional<String> result = examples.findNameById(99L);

        assertTrue(result.isEmpty());
    }

    @Test
    /** Learns that ofNullable wraps null safely as an empty Optional. */
    void wrapNullableValue_shouldReturnEmptyOptional_whenValueIsNull() {
        Optional<String> result = examples.wrapNullableValue(null);
        assertTrue(result.isEmpty());
    }

    @Test
    /** Learns that orElse returns a fallback value when Optional is empty. */
    void getNameOrDefault_shouldReturnFallback_whenOptionalIsEmpty() {
        String result = examples.getNameOrDefault(Optional.empty());
        assertEquals("Unknown", result);
    }

    @Test
    /** Learns that map transforms the value inside Optional when present. */
    void convertNameToUpperCase_shouldTransformValue_whenOptionalHasValue() {
        Optional<String> result = examples.convertNameToUpperCase(Optional.of("cemal"));
        assertTrue(result.isPresent());
        assertEquals("CEMAL", result.get());
    }

    @Test
    /** Learns that filter keeps the value only if the condition matches. */
    void keepOnlyNamesStartingWithC_shouldReturnValue_whenConditionMatches() {
        Optional<String> result = examples.keepOnlyNamesStartingWithC(Optional.of("Cemal"));
        assertTrue(result.isPresent());
        assertEquals("Cemal", result.get());
    }

    @Test
    /** Learns that filter returns empty when the condition does not match. */
    void keepOnlyNamesStartingWithC_shouldReturnEmpty_whenConditionDoesNotMatch() {
        Optional<String> result = examples.keepOnlyNamesStartingWithC(Optional.of("Ahmet"));

        assertTrue(result.isEmpty());
    }

    @Test
    /** Learns that orElseThrow throws an exception when Optional is empty. */
    void getNameOrThrow_shouldThrowException_whenOptionalIsEmpty() {
        assertThrows(IllegalArgumentException.class, () ->
                examples.getNameOrThrow(Optional.empty())
        );
    }

    @Test
    /** Learns that Optional.of does not allow null values. */
    void validateOptionalOf_shouldThrowException_whenValueIsNull() {
        assertThrows(NullPointerException.class, () ->
                examples.validateOptionalOf(null)
        );
    }
}
