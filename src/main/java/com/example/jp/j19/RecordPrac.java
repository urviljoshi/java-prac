package com.example.jp.j19;

public class RecordPrac {
    public static void main(String[] args) {
    Point point1 = new Point(4,5);
    Point point2 = new Point(3,4);
    Object twoPoint = new TwoPoints(point1,point2);
    // nested recored pattern match
    if(twoPoint instanceof TwoPoints(Point(int x1,int y1),Point(int x2,int y2))){
        System.out.println(x1+x2);
        System.out.println(y1+y2);
    }
    }
}
