package com.cmlbay.javaadvancedlab.streams;

import java.util.List;
import java.util.Optional;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-23
 */
public class AdvancedStreamExamples {

    public List<String> sortNamesAlphabetically(List<String> names) {
        return names.stream()
                .sorted()
                .toList();
    }

    public List<String> getDistinctNames(List<String> names) {
        return names.stream()
                .distinct()
                .toList();
    }

    public Optional<String> findFirstNameStartingWithA(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A"))
                .findFirst();
    }

    public boolean hasAnyNameStartingWithA(List<String> names) {
        return names.stream()
                .anyMatch(name -> name.startsWith("A"));
    }

    public boolean areAllNamesLongerThanTwo(List<String> names) {
        return names.stream()
                .allMatch(name -> name.length() > 2);
    }

    public List<String> getFirstTwoNames(List<String> names) {
        return names.stream()
                .limit(2)
                .toList();
    }

    public List<String> skipFirstTwoNames(List<String> names) {
        return names.stream()
                .skip(2)
                .toList();
    }
}
