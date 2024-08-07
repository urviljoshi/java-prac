package com.example.jp.Articles.sealed_classes;

public sealed interface FuelType permits Patrol,Diesel,CNG {
    int getCurrentPrice();
}

final class Patrol implements FuelType {

    @Override
    public int getCurrentPrice() {
        return 80;
    }
}

sealed class Diesel implements FuelType{

    @Override
    public int getCurrentPrice() {
        return 70;
    }
}

non-sealed class CNG implements FuelType{

    @Override
    public int getCurrentPrice() {
        return 50;
    }
}

final class DieselChild extends Diesel{

}

