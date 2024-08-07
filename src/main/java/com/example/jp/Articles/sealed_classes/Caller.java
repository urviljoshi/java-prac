package com.example.jp.Articles.sealed_classes;

public class Caller {

    public static void main(String[] args) {
        FuelType f = new Patrol();
        System.out.println(getFuelType(f));

    }

    private static String getFuelType(FuelType f) {
        return switch (f){
            case Patrol p -> "This is patrol";
            case Diesel d-> "This is Diesel";
            case CNG c -> "This is CNG";
        };
    }
}
