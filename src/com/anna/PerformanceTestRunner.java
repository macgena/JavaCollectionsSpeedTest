package com.anna;

public class PerformanceTestRunner {
    private long start, end;

    public long runTest(String dataStructure, String testName, TestCallback callback) {
        long diff;
        start = System.nanoTime();
        callback.call();
        end = System.nanoTime();
        diff = end - start;
        System.out.println(dataStructure + " " + testName + ": " + diff);
        return diff;
    }
}
