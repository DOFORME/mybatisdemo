package com.lc.visitor2;

public class VistorTest4 extends VistorTest2 {

    public VistorTest4(int k) {
//      父类如果没有默认构造方法，子类构造器就必须明确调用父类的哪个构造方法
//        super(k);
        System.out.println(k);
    }

    public static void main(String[] args) {
        VistorTest4 vt = new VistorTest4(6);
    }
}
