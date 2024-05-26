package com.example.jp.j14;

public class TextBlocks {
    public static void main(String[] args) {
        String s ="""
                Hi \
                how\sare\syou\n
                hello
                """;
        String a = "Hi\\nhello";
        System.out.println(s);
        System.out.println(s.translateEscapes());
        System.out.println(a);
        System.out.println(a.translateEscapes());


    }
}
