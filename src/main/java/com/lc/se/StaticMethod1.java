package com.lc.se;

public class StaticMethod1 {


    public static void testMethod() {
        StaticMethod2 sm2 = new StaticMethod2();
        sm2.dynamicMethod();
        System.out.println("test method of 1");
    }

    public static void main(String[] args) {
        StaticMethod1.testMethod();
    }
}
