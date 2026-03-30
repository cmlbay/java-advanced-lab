package com.cmlbay.javaadvancedlab.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-30
 */
public class CopyExamplesTest {
    private final CopyExamples examples = new CopyExamples();

    /** Learns that values can be copied from a producer list to a consumer list. */
    @Test
    void copy_shouldMoveValuesFromIntegerListToNumberList(){
        List<Integer> source = List.of(1, 2, 3);
        List<Number> target = new ArrayList<>();

        examples.copy(source, target);
        assertEquals(List.of(1,2,3), target);
    }

}
