package com.example.jp.j19;

import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

public class VirtualThreads {



    public static void main(String[] args) {
       fixedPool();
        virtualThreads();
    }

    private static void fixedPool() {
        long a =System.currentTimeMillis();

        try (var exe = Executors.newFixedThreadPool(20)) {
            IntStream.range(0, 100).forEach(i ->
                    exe.submit(() -> {
                        Thread.sleep(100);
                        return i;
                    })
            );
        }

        System.out.println("fixed OS threads  ::" + (System.currentTimeMillis()-a));
    }

    private static void virtualThreads() {
        long a =System.currentTimeMillis();

        try (var exe = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 100).forEach(i ->
                    exe.submit(() -> {
                        Thread.sleep(100);
                        return i;
                    })
            );
        }

        System.out.println("virtual threads  :: " + (System.currentTimeMillis()-a));
    }
}
