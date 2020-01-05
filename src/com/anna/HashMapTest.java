package com.anna;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest extends BaseMapTest {
    @Override
    public Map<Integer, Integer> allocateElements() {
        return new HashMap<>();
    }
}
