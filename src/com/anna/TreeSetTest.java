package com.anna;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest extends BaseSetTest {
    @Override
    public Set<Integer> allocateElements() {
        return new TreeSet<>();
    }
}
