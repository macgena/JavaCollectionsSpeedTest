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
        long start, end, time1, time2;
        HashMapTest hashMapTest = new HashMapTest();
        TreeMapTest treeMapTest = new TreeMapTest();
        PerformanceTestRunner testRunner = new PerformanceTestRunner();
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|              HashMap            VS            TreeMap                |");
        System.out.println("------------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                     INITIALIZE TIME (in order)                       |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("HashMap","initialize time (in order)", hashMapTest::initializeInOrder);
        hashMapTest.reset();

        time2 = testRunner.runTest("TreeMap", "initialize time (in order)", treeMapTest::initializeInOrder);
        treeMapTest.reset();

        System.out.println("HashMap faster in: " + (time2 / (double) time1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                 INITIALIZE TIME (reverse order)                      |");
        System.out.println("------------------------------------------------------------------------");
        
        time1 = testRunner.runTest("HashMap","initialize time (in order)", hashMapTest::initializeWithReverseOrder);
        hashMapTest.reset();

        time2 = testRunner.runTest("TreeMap","initialize time (reverse order)", treeMapTest::initializeWithReverseOrder);
        treeMapTest.reset();

        System.out.println("HashMap faster in: " + (time2 / (double) time1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                 INITIALIZE TIME (random order)                       |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("HashMap","initialize time (random order)", hashMapTest::initializeWithRandomOrder);

        time2 = testRunner.runTest("TreeMap","initialize time (random order)", treeMapTest::initializeWithRandomOrder);

        System.out.println("HashMap faster in: " + (time2 / (double) time1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                             REMOVE TIME                              |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("HashMap","remove time", hashMapTest::removeRandomElements);

        time2 = testRunner.runTest("TreeMap","remove time", treeMapTest::removeRandomElements);

        System.out.println("HashMap faster in: " + (time2 / (double) time1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                             GET TIME                                 |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("HashMap","get time", hashMapTest::getRandomElements);

        time2 = testRunner.runTest("TreeMap","remove time", treeMapTest::getRandomElements);

        System.out.println("HashMap faster in: " + (time2 / (double) time1) + " times");
    }

    private static void testHashSetVSTreeSet() {
        long start, end, time1, time2;
        HashSetTest hashSetTest = new HashSetTest();
        TreeSetTest treeSetTest = new TreeSetTest();
        PerformanceTestRunner testRunner = new PerformanceTestRunner();


        // NOTE: Test of getting items by index
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|              HashSet            VS            TreeSet                |");
        System.out.println("------------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                     INITIALIZE TIME (in order)                       |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("HashSet","initialize time(in order)", hashSetTest::initializeInOrder);
        hashSetTest.reset();

        time2 = testRunner.runTest("TreeSet","initialize time(in order)", treeSetTest::initializeInOrder);
        treeSetTest.reset();

        System.out.println("HashSet faster in: " + (time2 / (double) time1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                 INITIALIZE TIME (reverse order)                      |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("HashSet","initialize time(reverse order)", hashSetTest::initializeWithReverseOrder);
        hashSetTest.reset();

        time2 = testRunner.runTest("TreeSet","initialize time(reverse order)", treeSetTest::initializeWithReverseOrder);
        treeSetTest.reset();

        System.out.println("HashSet faster in: " + (time2 / (double) time1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                 INITIALIZE TIME (random order)                       |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("HashSet","initialize time(random order)", hashSetTest::initializeWithRandomOrder);

        time2 = testRunner.runTest("TreeSet","initialize time(random order)", treeSetTest::initializeWithRandomOrder);

        System.out.println("HashSet faster in: " + (time2 / (double) time1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                             REMOVE TIME                              |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("HashSet","remove time", hashSetTest::removeRandomElements);

        time2 = testRunner.runTest("TreeSet","remove time", treeSetTest::removeRandomElements);

        System.out.println("HashSet faster in: " + (time2 / (double) time1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                           CONTAINS TIME                              |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("HashSet","contains time", hashSetTest::checkIfContainsValue);

        time2 = testRunner.runTest("TreeSet","contains time", treeSetTest::checkIfContainsValue);

        System.out.println("HashSet faster in: " + (time2 / (double) time1) + " times");
    }

    private static void testArrayListVSLinkedList() {
        long start, end, time1, time2;
        LinkedListTest linkedListTest = new LinkedListTest();
        ArrayListTest arrayListTest = new ArrayListTest();
        PerformanceTestRunner testRunner = new PerformanceTestRunner();

        System.out.println("------------------------------------------------------------------------");
        System.out.println("|              ArrayList            VS            LinkedList           |");
        System.out.println("------------------------------------------------------------------------");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                            INITIALIZE TIME                           |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("ArrayList","initialize time", arrayListTest::initializeWithRandomOrder);

        time2 = testRunner.runTest("LinkedList","initialize time", linkedListTest::initializeWithRandomOrder);

        System.out.println("ArrayList faster in: " + (time2 / (double) time1) + " times");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                     GET ELEMENT BY INDEX(random)                     |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("ArrayList","get time", arrayListTest::getElementsByIndex);

        time2 = testRunner.runTest("LinkedList","get time", linkedListTest::getElementsByIndex);

        System.out.println("ArrayList faster in: " + (time2 / (double) time1) + " times");


        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                           INSERT INTO ARRAY (random)                 |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("ArrayList","insert time", arrayListTest::insertElementInside);

        time2 = testRunner.runTest("LinkedList","insert time", linkedListTest::insertElementInside);

        System.out.println("ArrayList faster in: " + (time2 / (double) time1) + " times");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                         REMOVE ITEMS FROM ARRAY                       |");
        System.out.println("------------------------------------------------------------------------");

        time1 = testRunner.runTest("ArrayList","remove time", arrayListTest::removeElements);

        time2 = testRunner.runTest("LinkedList","remove time", linkedListTest::removeElements);

        System.out.println("ArrayList faster in: " + (time2 / (double) time1) + " times");
    }
}
