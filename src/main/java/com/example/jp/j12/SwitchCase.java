package com.example.jp.j12;

public class SwitchCase {

    public static void main(String[] args) {
        String day = "TUESDAY";
        String s = switch(day){
            case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> "Week";
            case "SATURDAY","SUNDAY" -> "holiday";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        System.out.println(s);
    }
}
