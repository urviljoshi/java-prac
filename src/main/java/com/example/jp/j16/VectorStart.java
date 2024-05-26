package com.example.jp.j16;

import jdk.incubator .vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

public class VectorStart {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        IntVector aI = IntVector.fromArray(IntVector.SPECIES_128,a,0);
        IntVector bI = IntVector.fromArray(IntVector.SPECIES_128,b,0);
        IntVector intVector= aI.mul(bI);
        System.out.println(intVector);
    }
}
