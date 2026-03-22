package com.cmlbay.javaadvancedlab.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-22
 */
public class SetExample {

    public Set<String> createHashSetExample(){
        Set<String> names = new HashSet<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Ali");

        return names;
    }

    public Set<String> createLinkedHashSetExample(){
        Set<String> cities = new LinkedHashSet<>();
        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Izmir");
        cities.add("Ankara");
        return cities;
    }

    public Set<String> createTreeSetExample() {
        Set<String> codes = new TreeSet<>();
        codes.add("T250");
        codes.add("E120");
        codes.add("L300");
        codes.add("E120");
        return codes;
    }

    public boolean containsElementInSet(Set<String> items, String value){
        return items.contains(value);
    }

    public boolean addElementToSet(Set<String> items, String value){
        return items.add(value);
    }

    public boolean removeElementFromSet(Set<String> items, String value){
        return items.remove(value);
    }

}
