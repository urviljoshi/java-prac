package com.example.jp.j20;

import java.time.Duration;

public class ScopedValuesPrac {





    public static void main(String[] args) {

        ThreadPrac a =new ThreadPrac();
        ThreadPrac b =new ThreadPrac();

        ScopedValue.where(ThreadPrac.scopedValue,"urvil").run(a);
        ScopedValue.where(ThreadPrac.scopedValue,"urvil1").run(b);
    }

    static class ThreadPrac implements Runnable{

       public static ScopedValue<String> scopedValue = ScopedValue.newInstance();

        @Override
        public void run() {
            System.out.println("this thread:: "+scopedValue.get());
        }
    }
}
