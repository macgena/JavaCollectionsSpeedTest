package com.anna;

import java.util.Map;
import java.util.Random;

public abstract class BaseMapTest {
    Map<Integer, Integer> elements;

    BaseMapTest() {
        elements = allocateElements();
    }

    public abstract Map<Integer, Integer> allocateElements();

    public void initializeInOrder() {
        for (int i = 0; i < Main.ELEMENTS_COUNT; i++) {
            elements.put(i, i);
        }
    }

    public void initializeWithReverseOrder() {
        for (int i = 0; i < Main.ELEMENTS_COUNT; i++) {
            elements.put(Main.ELEMENTS_COUNT - i, i);
        }
    }

    public void initializeWithRandomOrder() {
        Random random = new Random();
        for (int i = 0; i < Main.ELEMENTS_COUNT; i++) {
            elements.put(random.nextInt( Main.ELEMENTS_COUNT), i);
        }
    }

    public void removeRandomElements() {
        Random random = new Random();
        for (int i = 0; i < Main.TEST_COUNT; i++) {
            elements.remove(random.nextInt( Main.ELEMENTS_COUNT));
        }
    }

    public void getRandomElements() {
        Random random = new Random();
        for (int i = 0; i < Main.TEST_COUNT; i++) {
            elements.get(random.nextInt( Main.ELEMENTS_COUNT));
        }
    }

    public void reset() {
        elements.clear();
    }
}
