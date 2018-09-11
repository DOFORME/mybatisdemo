package com.lc.visitor1;

public class VistorTest5 extends VistorTest3 {

    public VistorTest5() {}

    public VistorTest5(int j) {
        System.out.println("this is vistor test 5 j = " + j);
    }

    public static void main(String[] args) {
        VistorTest5 vt = new VistorTest5(65);
    }
}
