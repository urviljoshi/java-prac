package com.example.jp.j12;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorChanges {
    public static void main(String[] args) {
        var r = Stream.of(1,2,3,4,5).collect(Collectors.teeing(Collectors.summingInt(i->i), Collectors.counting(),(a,b)->(double)a/b));
        System.out.println(r);
    }
}
