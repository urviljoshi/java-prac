package com.example.jp.j12;

public class StringChanges {

    public static void main(String[] args) {
        String s = "This is urvil";
        System.out.println("with indent: "+s.indent(4));
        System.out.println("---- "+s);
        System.out.println("remove indent: "+ s.indent(-10));

        var a=s.transform(x-> new StringBuilder(x).reverse().toString());
        System.out.println("with trans: "+a);
        System.out.println("---- "+s);

    }
}
