package ru.artkulov.java.basic.homeworks.homework14;

public class MultiThreadArrayFill {
    private static final int ARRAY_SIZE = 100_000_000;
    private static final int THREAD_COUNT = 4;
    private static double[] array = new double[ARRAY_SIZE];

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int t = 0; t < THREAD_COUNT; t++) {
            final int threadIndex = t;
            threads[t] = new Thread(() -> fillArray(threadIndex));
            threads[t].start();
        }
        for (int i = 0; i < THREAD_COUNT; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Время выполнения (четыре потока): " + (System.currentTimeMillis() - startTime) + " мс");
    }

    private static void fillArray(int threadIndex) {
        int needSize = ARRAY_SIZE / THREAD_COUNT;
        int start = threadIndex * needSize;
        int end = (threadIndex + 1) * needSize;
        for (int i = start; i < end; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
