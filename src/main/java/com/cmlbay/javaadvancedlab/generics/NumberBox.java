package com.cmlbay.javaadvancedlab.generics;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-25
 */
public class NumberBox<T extends Number>{
    private final T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double doubleValue() {
        return value.doubleValue();
    }

}
