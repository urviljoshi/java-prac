package com.example.jp.j19;

import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

public class VirtualThreads {

    public static void main(String[] args) {
        long a =0;

        try (var exe = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i ->
                    exe.submit(() -> {
                        Thread.sleep(1000);
                        return i;
                    })
            );
        }

        System.out.println("virtual threads" + (System.currentTimeMillis()-a));
    }
}
