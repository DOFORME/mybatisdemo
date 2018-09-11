package com.lc.visitor1;

public class VistorTest3 {

    public VistorTest3() {
        System.out.println("this is vistor 3 no arg constructor");
    }

    public VistorTest3(int i) {
        System.out.println("v t 3 constructor i = " + i);
    }

    public static void main(String[] args) {
        System.out.println(VistorTest1.i);
        System.out.println(VistorTest1.j);
    }
}
