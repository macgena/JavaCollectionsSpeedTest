package com.anna;

import java.util.*;

public class LinkedListTest extends BaseListTest {
    @Override
    protected List<Integer> allocateElements() {
        return new LinkedList<>();
    }
}
