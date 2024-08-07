package com.example.jp.j20;

public class ScopedValueInherit implements Runnable{
    public static ScopedValue<String> s = ScopedValue.newInstance();
    public Thread childThread;
    @Override
    public void run() {
        System.out.println("parent:: "+s.get());
        childThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("child:: "+s.get());
            }
        });
       // ScopedValue.where(s,"child thread").run();
    }

    public static void main(String[] args) {
        ScopedValueInherit scopedValueInheri = new ScopedValueInherit();
        ScopedValue.where(s,"w");
    }
}
