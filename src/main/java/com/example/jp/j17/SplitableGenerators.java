package com.example.jp.j17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class SplitableGenerators {

    public static void main(String[] args) {
        RandomGenerator.SplittableGenerator sourceGenerator = RandomGenerator.SplittableGenerator.of("L128X256MixRandom");
        List<Integer> numbers = Collections.synchronizedList(new ArrayList<>());
        ExecutorService executorService = Executors.newCachedThreadPool();


        sourceGenerator.splits(20).forEach((splitGenerator) -> {
            executorService.submit(() -> {
                numbers.add(splitGenerator.nextInt(10));
            });
        });
    }
}
