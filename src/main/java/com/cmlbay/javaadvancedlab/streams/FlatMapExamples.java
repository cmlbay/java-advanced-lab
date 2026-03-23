package com.cmlbay.javaadvancedlab.streams;

import java.util.List;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-23
 */
public class FlatMapExamples {

    public List<String> flattenNestedLists(List<List<String>> nestedLists) {
        return nestedLists.stream()
                .flatMap(List::stream)
                .toList();
    }

    public List<String> extractAllRoles(List<UserRoles> users) {
        return users.stream()
                .flatMap(user -> user.roles().stream())
                .toList();
    }

    public List<String> extractDistinctSortedRoles(List<UserRoles> users) {
        return users.stream()
                .flatMap(user -> user.roles().stream())
                .distinct()
                .sorted()
                .toList();
    }
}
