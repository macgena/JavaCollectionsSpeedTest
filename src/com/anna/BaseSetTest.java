package com.anna;

import java.util.Random;
import java.util.Set;

public abstract class BaseSetTest {
    Set<Integer> elements;

    public abstract Set<Integer> allocateElements();

    BaseSetTest() {
        elements = allocateElements();
    }

    public void initializeInOrder() {
        for(int i = 0; i < Main.ELEMENTS_COUNT; i++) {
            elements.add(i);
        }
    }

    public void initializeWithReverseOrder() {
        for(int i = 0; i < Main.ELEMENTS_COUNT; i++) {
            elements.add(Main.ELEMENTS_COUNT - i);
        }
    }

    public void initializeWithRandomOrder() {
        Random random = new Random();
        for(int i = 0; i < Main.ELEMENTS_COUNT; i++) {
            elements.add(random.nextInt(Main.ELEMENTS_COUNT));
        }
    }

    public void checkIfContainsValue() {
        Random random = new Random();
        for(int i = 0; i < Main.TEST_COUNT; i++) {
            elements.contains(random.nextInt(Main.ELEMENTS_COUNT));
        }
    }

    public void removeRandomElements() {
        Random random = new Random();
        for(int i = 0; i < Main.TEST_COUNT; i++) {
            elements.remove(random.nextInt(Main.ELEMENTS_COUNT));
        }
    }

    public void reset() {
        elements = allocateElements();
    }
}
