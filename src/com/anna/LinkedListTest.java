package com.anna;

import java.util.*;

public class LinkedListTest extends BaseListTest {
    public LinkedListTest() {
        this.elements = generateRandomElements();
    };

    public static LinkedList<Integer> generateRandomElements() {
        LinkedList<Integer> result = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < Main.ELEMENTS_COUNT; i++) {
            result.add(random.nextInt());
        }
        return result;
    };
}
