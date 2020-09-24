package ch.juventus.generics;

import java.util.Map;

public class MapFilter {

    public <K, V> Map<K, V> cleanup(Map<K, V> map, V value) {
        map.entrySet().removeIf(entry -> entry.getValue() != value);
        return map;
    }
}