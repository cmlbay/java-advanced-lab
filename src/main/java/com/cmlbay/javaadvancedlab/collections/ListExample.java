package com.cmlbay.javaadvancedlab.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-19
 */
public class ListExample {

    public List<String> createArrayListExample(){
        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Burak");
        names.add("Ali");

        return names;
    }

    public List<String> createLinkedListExample(){
        List<String> cities = new LinkedList<>();
        cities.add("İstanbul");
        cities.add("Konya");
        cities.add("Bilecik");

        return cities;
    }

    public String getSecondElement(List<String> items){
        return items != null && items.size() > 0 ? items.get(1) : "";
    }

    public void addElementAtIndex(List<String>items, int index, String value){
        if(items == null) return;

        items.add(index, value);
    }
}
