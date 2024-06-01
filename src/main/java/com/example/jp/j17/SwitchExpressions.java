package com.example.jp.j17;

public class SwitchExpressions {
    public static void main(String[] args) {
        Shape s = new Triangle();
        int a = switch (s) {
            case Triangle t -> t.sides();
            case Square sq -> sq.sides();
            default -> 0;
        };
        System.out.println(a);
    }
}
