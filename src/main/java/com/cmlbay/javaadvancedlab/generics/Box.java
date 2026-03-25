package com.cmlbay.javaadvancedlab.generics;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-25
 */
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
