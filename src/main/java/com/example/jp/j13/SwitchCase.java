package com.example.jp.j13;

public class SwitchCase {

    public static void main(String[] args) {
        String day = "TUESDAY";
        String s = switch(day){
            case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> "Week";
            case "SATURDAY","SUNDAY" -> {
                yield "holiday";
            }
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        System.out.println(s);
    }
}
