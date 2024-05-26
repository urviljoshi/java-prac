package com.example.jp.j17;

import java.util.Comparator;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class PRNGChanges {

    public static void main(String[] args) {
        RandomGeneratorFactory.all().sorted(Comparator.comparing(RandomGeneratorFactory::name)).forEach(factory -> System.out.println(String.format("%s\t%s\t%s\t%s",
                factory.group(),
                factory.name(),
                factory.isJumpable(),
                factory.isSplittable())));

        RandomGeneratorFactory.all().filter(RandomGeneratorFactory::isJumpable).findAny().map(RandomGeneratorFactory::create).orElseThrow(() -> new RuntimeException("Error creating a generator"));
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        RandomGenerator randomGenerator1 = RandomGenerator.of("L128X256MixRandom");
        RandomGenerator randomGenerator2 = RandomGeneratorFactory.of("L128X256MixRandom").create();
    }
}
