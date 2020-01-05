package com.anna;

import java.util.*;

public class ArrayListTest extends BaseListTest {
    public ArrayListTest() {
        this.elements = generateRandomElements();
    };

    public static ArrayList<Integer> generateRandomElements() {
        ArrayList<Integer> result = new ArrayList<>(Main.ELEMENTS_COUNT + Main.TEST_COUNT);
        Random random = new Random();
        for (int i = 0; i < Main.ELEMENTS_COUNT; i++) {
            result.add(random.nextInt());
        }
        return result;
    };
}
