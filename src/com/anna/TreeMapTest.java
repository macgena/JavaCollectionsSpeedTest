package com.anna;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest extends BaseMapTest {
    @Override
    public Map<Integer, Integer> allocateElements() {
        return new TreeMap<>();
    }
}
