package com.anna;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest extends BaseSetTest {
    @Override
    public Set<Integer> allocateElements() {
        return new HashSet<>(Main.ELEMENTS_COUNT, 1);
    }
}
