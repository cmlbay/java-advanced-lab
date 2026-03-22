package com.cmlbay.javaadvancedlab.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-22
 */
public class MapExample {
    public Map<String, String> createHashMapExample() {
        Map<String, String> cities = new HashMap<>();
        cities.put("34", "Istanbul");
        cities.put("06", "Ankara");
        cities.put("35", "Izmir");
        return cities;
    }

    public Map<String, String> createLinkedHashMapExample() {
        Map<String, String> cities = new LinkedHashMap<>();
        cities.put("34", "Istanbul");
        cities.put("06", "Ankara");
        cities.put("35", "Izmir");
        return cities;
    }

    public Map<String, String> createTreeMapExample() {
        Map<String, String> cities = new TreeMap<>();
        cities.put("35", "Izmir");
        cities.put("06", "Ankara");
        cities.put("34", "Istanbul");
        return cities;
    }

    public String getValue(Map<String, String> items, String key) {
        return items.get(key);
    }

    public boolean containsKey(Map<String, String> items, String key) {
        return items.containsKey(key);
    }

    public String removeKey(Map<String, String> items, String key) {
        return items.remove(key);
    }

    public String putValue(Map<String, String> items, String key, String value) {
        return items.put(key, value);
    }

    public String getOrDefaultValue(Map<String, String> items, String key, String defaultValue) {
        return items.getOrDefault(key, defaultValue);
    }
}
