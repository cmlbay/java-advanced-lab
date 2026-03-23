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
public class FlatMapExamplesTest {
    private final FlatMapExamples examples = new FlatMapExamples();

    @Test
    /** Learns that flatMap flattens nested lists into a single stream. */
    void flattenNestedLists_shouldReturnSingleFlatList() {
        List<List<String>> nested = List.of(
                List.of("Ali", "Veli"),
                List.of("Ayşe", "Fatma")
        );

        List<String> result = examples.flattenNestedLists(nested);
        assertEquals(List.of("Ali", "Veli", "Ayşe", "Fatma"), result);
    }

    @Test
    /** Learns that flatMap can extract nested values from objects. */
    void extractAllRoles_shouldReturnAllRolesFromUsers() {
        List<UserRoles> users = List.of(
                new UserRoles(1L, "Cemal", List.of("ADMIN", "USER")),
                new UserRoles(2L, "Ahmet", List.of("USER")),
                new UserRoles(3L, "Ayşe", List.of("MANAGER"))
        );

        List<String> result = examples.extractAllRoles(users);

        assertEquals(List.of("ADMIN", "USER", "USER", "MANAGER"), result);
    }

    @Test
    /** Learns that flatMap can be combined with distinct and sorted. */
    void extractDistinctSortedRoles_shouldReturnUniqueSortedRoles() {
        List<UserRoles> users = List.of(
                new UserRoles(1L, "Cemal", List.of("ADMIN", "USER")),
                new UserRoles(2L, "Ahmet", List.of("USER")),
                new UserRoles(3L, "Ayşe", List.of("MANAGER", "ADMIN"))
        );

        List<String> result = examples.extractDistinctSortedRoles(users);

        assertEquals(List.of("ADMIN", "MANAGER", "USER"), result);
    }
}
