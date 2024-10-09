package com.atguigu;

import java.util.concurrent.atomic.AtomicLong;

public class StackRecurrence {

    private static AtomicLong atomicLong = new AtomicLong(0);

    public static void test(){
        System.out.println(atomicLong.getAndIncrement());
        test();
    }

    public static void main(String[] args){
        StackRecurrence.test();
    }
}
