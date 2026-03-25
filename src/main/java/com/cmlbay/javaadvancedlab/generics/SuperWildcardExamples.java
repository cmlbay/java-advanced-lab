package com.cmlbay.javaadvancedlab.generics;

import java.util.List;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-25
 */
public class SuperWildcardExamples {

    public void addDefaultIntegers(List<? super Integer> numbers) {
        numbers.add(10);
        numbers.add(20);
    }
}
