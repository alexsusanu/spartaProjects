package com.sparta.sortingalgos.utils;

/**
 * Timing class
 */
public class Timing {
    private final long startTime = System.nanoTime();
    private final long endTime = System.nanoTime();

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    /**
     * Calculate execution time
     * @param start start time
     * @param end end time
     * @return different end-start in milliseconds as float
     */
    public float timeResult(long start, long end){
        return (float)(end-start) / 1_000_000;
    }
}
