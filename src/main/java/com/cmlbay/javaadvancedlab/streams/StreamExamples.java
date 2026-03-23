package com.cmlbay.javaadvancedlab.streams;

import java.util.List;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-23
 */
public class StreamExamples {

    public List<String> filterNamesStartingWithA(List<String> names){
        return names.stream()
                .filter(item -> item.startsWith("A"))
                .toList();
    }

    public List<String> convertNamesToUpperCase(List<String> names){
        return names.stream()
                .map(String::toUpperCase)
                .toList();
    }

    public List<String> filterLongerThanFourAndConvertToUpperCase(List<String> names){
        return names.stream()
                .filter(item -> item.length() > 4)
                .map(String::toUpperCase)
                .toList();
    }

    public long countNamesLongerThanFour(List<String> names){
        return names.stream()
                .filter(item -> item.length() > 4)
                .count();
    }
}
