package com.example.jp.j15;

public class PatternMatching {
    public static void main(String[] args) {
        SealedClasses sealedClasses = new SealedClassesChild();
        if(sealedClasses instanceof SealedClassesChild s && s.getClass().equals(SealedClassesChild.class)){
            // can write with conditional statements
        }

    }

}
