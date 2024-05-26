package com.example.jp.j16;

import java.util.Arrays;
import java.util.List;

public class ToList {
    public static void main(String[] args) {
        List<String> integersAsString = Arrays.asList("1", "2", "3");
        List<Integer> a= integersAsString.stream().map(Integer::parseInt).toList();
    }
}
