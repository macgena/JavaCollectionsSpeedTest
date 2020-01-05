package com.anna;

public class Main {
    public static final int ELEMENTS_COUNT = 100000;
    public static final int TEST_COUNT = 1000;

    public static void main(String[] args) {
        testArrayListVSLinkedList();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        testHashSetVSTreeSet();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        testHashMapVSTreeMap();
    }

    private static void testHashMapVSTreeMap() {
        long start, end, diff1, diff2;
        HashMapTest hashMapTest = new HashMapTest();
        TreeMapTest treeMapTest = new TreeMapTest();


        // NOTE: Test of getting items by index
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|              HashMap            VS            TreeMap                |");
        System.out.println("------------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                     INITIALIZE TIME (in order)                       |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        hashMapTest.initializeInOrder();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("HashMap initialize time (in order): " + diff1);
        hashMapTest.reset();

        start = System.nanoTime();
        treeMapTest.initializeInOrder();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("TreeMap initialize time (in order): " + diff2);
        treeMapTest.reset();

        System.out.println("HashMap faster in: " + (diff2 / (double) diff1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                 INITIALIZE TIME (reverse order)                      |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        hashMapTest.initializeWithReverseOrder();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("HashMap initialize time (reverse order): " + diff1);
        hashMapTest.reset();

        start = System.nanoTime();
        treeMapTest.initializeWithReverseOrder();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("TreeMap initialize time (reverse order): " + diff2);
        treeMapTest.reset();

        System.out.println("HashMap faster in: " + (diff2 / (double) diff1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                 INITIALIZE TIME (random order)                       |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        hashMapTest.initializeWithRandomOrder();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("HashMap initialize time (random order): " + diff1);

        start = System.nanoTime();
        treeMapTest.initializeWithRandomOrder();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("TreeMap initialize time (random order): " + diff2);

        System.out.println("HashMap faster in: " + (diff2 / (double) diff1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                             REMOVE TIME                              |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        hashMapTest.removeRandomElements();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("HashMap remove time: " + diff1);

        start = System.nanoTime();
        treeMapTest.removeRandomElements();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("TreeMap remove time: " + diff2);

        System.out.println("HashMap faster in: " + (diff2 / (double) diff1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                             GET TIME                                 |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        hashMapTest.getRandomElements();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("HashMap get time: " + diff1);

        start = System.nanoTime();
        treeMapTest.getRandomElements();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("TreeMap get time: " + diff2);

        System.out.println("HashMap faster in: " + (diff2 / (double) diff1) + " times");
    }

    private static void testHashSetVSTreeSet() {
        long start, end, diff1, diff2;
        HashSetTest hashSetTest = new HashSetTest();
        TreeSetTest treeSetTest = new TreeSetTest();


        // NOTE: Test of getting items by index
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|              HashSet            VS            TreeSet                |");
        System.out.println("------------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                     INITIALIZE TIME (in order)                       |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        hashSetTest.initializeInOrder();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("HashSet initialize time (in order): " + diff1);
        hashSetTest.reset();

        start = System.nanoTime();
        treeSetTest.initializeInOrder();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("TreeSet initialize time (in order): " + diff2);
        treeSetTest.reset();

        System.out.println("HashSet faster in: " + (diff2 / (double) diff1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                 INITIALIZE TIME (reverse order)                      |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        hashSetTest.initializeWithReverseOrder();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("HashSet initialize time (reverse order): " + diff1);
        hashSetTest.reset();

        start = System.nanoTime();
        treeSetTest.initializeWithReverseOrder();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("TreeSet initialize time (reverse order): " + diff2);
        treeSetTest.reset();

        System.out.println("HashSet faster in: " + (diff2 / (double) diff1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                 INITIALIZE TIME (random order)                       |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        hashSetTest.initializeWithRandomOrder();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("HashSet initialize time (random order): " + diff1);

        start = System.nanoTime();
        treeSetTest.initializeWithRandomOrder();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("TreeSet initialize time (random order): " + diff2);

        System.out.println("HashSet faster in: " + (diff2 / (double) diff1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                             REMOVE TIME                              |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        hashSetTest.removeRandomElements();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("HashSet remove time: " + diff1);

        start = System.nanoTime();
        treeSetTest.removeRandomElements();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("TreeSet remove time: " + diff2);

        System.out.println("HashSet faster in: " + (diff2 / (double) diff1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                           CONTAINS TIME                              |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        hashSetTest.checkIfContainsValue();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("HashSet contains time: " + diff1);

        start = System.nanoTime();
        treeSetTest.checkIfContainsValue();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("TreeSet contains time: " + diff2);

        System.out.println("HashSet faster in: " + (diff2 / (double) diff1) + " times");
    }

    private static void testArrayListVSLinkedList() {
        long start, end, diff1, diff2;
        LinkedListTest b = new LinkedListTest();
        ArrayListTest a = new ArrayListTest();

        // NOTE: Test of getting items by index
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|              ArrayList            VS            LinkedList           |");
        System.out.println("------------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                            INITIALIZE TIME                           |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        a.initializeWithRandomOrder();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("Array list initialize time: " + diff1);


        start = System.nanoTime();
        b.initializeWithRandomOrder();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("Linked list initialize time: " + diff2);

        System.out.println("ArrayList faster in: " + (diff2 / (double) diff1) + " times");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                     GET ELEMENT BY INDEX(random)                     |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        a.getElementsByIndex();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("Array list gets time: " + diff1);

        start = System.nanoTime();
        b.getElementsByIndex();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("Linked list gets time: " + diff2);

        System.out.println("ArrayList faster in: " + (diff2 / (double) diff1) + " times");

        // NOTE: Test of inserting items inside Lists
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                           INSERT INTO ARRAY (random)                 |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        a.insertElementInside();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("Array list gets time: " + diff1);

        start = System.nanoTime();
        b.insertElementInside();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("Linked list gets time: " + diff2);

        System.out.println("ArrayList faster in: " + (diff2 / (double) diff1) + " times");

        // NOTE: Test of removing items from Lists
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                         REMOVE ITEMS FROM ARRAY                       |");
        System.out.println("------------------------------------------------------------------------");

        start = System.nanoTime();
        a.removeElements();
        end = System.nanoTime();
        diff1 = end - start;
        System.out.println("Array list time: " + diff1);

        start = System.nanoTime();
        b.removeElements();
        end = System.nanoTime();
        diff2 = end - start;
        System.out.println("Linked list time: " + diff2);

        System.out.println("ArrayList faster in: " + (diff2 / (double) diff1) + " times");
    }
}
