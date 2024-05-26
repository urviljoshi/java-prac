package com.example.jp.j16;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayPeriodSupport {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("BBBBB");
       System.out.println(dateTimeFormatter.format(localTime));
    }
}
