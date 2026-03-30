package com.cmlbay.javaadvancedlab.generics;

import java.util.List;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-30
 */
public class CopyExamples {

    public <T> void copy(List<? extends T> source, List<? super T> target ) {
        for (T t : source) {
            target.add(t);
        }
    }
}
