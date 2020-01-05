package com.anna;

import java.util.List;
import java.util.Random;

public abstract class BaseListTest {
    protected List<Integer> elements;

    BaseListTest() {
        elements = allocateElements();
    }

    protected abstract List<Integer> allocateElements();

    public void initializeWithRandomOrder() {
        Random random = new Random();
        for (int i = 0; i < Main.ELEMENTS_COUNT; i++) {
            elements.add(random.nextInt());
        }
    }

    public void getElementsByIndex() {
        Random random = new Random();
        for (int i = 0; i < Main.TEST_COUNT; i++) {
            elements.get(random.nextInt(Main.ELEMENTS_COUNT));
        }
    }

    public void insertElementInside() {
        Random random = new Random();
        for (int i = 0; i < Main.TEST_COUNT; i++) {
            elements.add(random.nextInt(Main.ELEMENTS_COUNT), random.nextInt());
        }
    }

    public void removeElements() {
        Random random = new Random();
        for (int i = 0; i < Main.TEST_COUNT; i++) {
            elements.remove(random.nextInt(Main.ELEMENTS_COUNT));
        }
    }
}
