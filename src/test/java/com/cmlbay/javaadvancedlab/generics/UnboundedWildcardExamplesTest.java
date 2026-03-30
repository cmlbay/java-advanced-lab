package com.cmlbay.javaadvancedlab.generics;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-30
 */
public class UnboundedWildcardExamplesTest {
    private final UnboundedWildcardExamples examples = new UnboundedWildcardExamples();

    /** Learns that an unbounded wildcard can work with any list type. */
    @Test
    void getSize_shouldWorkWithAnyListType(){
        assertEquals(3,examples.getSize(List.of("A","B","C")));
        assertEquals(2,examples.getSize(List.of(1,2)));
    }

    /** Learns that values read from List<?> are treated as Object. */
    @Test
    void getFirstElement_shouldReturnObject(){
        Object result = examples.getFirstElement(List.of("A","B","C"));
        assertEquals("A",result);
    }
}
