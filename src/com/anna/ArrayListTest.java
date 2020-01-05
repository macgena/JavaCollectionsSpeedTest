package com.anna;

import java.util.*;

public class ArrayListTest extends BaseListTest {
    @Override
    protected List<Integer> allocateElements() {
        return new ArrayList<>(Main.ELEMENTS_COUNT + Main.TEST_COUNT);
    }
}
