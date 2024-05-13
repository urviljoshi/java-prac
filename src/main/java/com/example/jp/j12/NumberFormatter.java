package com.example.jp.j12;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatter {

    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(Locale.US,NumberFormat.Style.SHORT);
        numberFormat.setMaximumFractionDigits(2);
        System.out.println(numberFormat.format(2000));

        NumberFormat numberFormat1 = NumberFormat.getCompactNumberInstance(Locale.US,NumberFormat.Style.LONG);
        numberFormat1.setMaximumFractionDigits(2);
        System.out.println(numberFormat1.format(2000));
    }
}
