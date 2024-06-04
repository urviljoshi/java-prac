package com.example.jp.j19;

public class PatternMatchingChanges {

    public static void main(String[] args) {
       System.out.println(switcher ("urvilj"));
    }

    public static String switcher(Object s1){

        return switch (s1){
            case String s
                    when s.length()>10 || (s.contains("urv"))-> "yes";
            case null-> "null";
            default->  "";
        };
    }
}
