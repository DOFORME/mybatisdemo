package com.lc.visitor2;

import com.lc.visitor1.VistorTest1;

public class VistorTest2 extends VistorTest1 {

    public VistorTest2() {
        super(10);
    }

    public VistorTest2(int j) {
        super(j);
        System.out.println(j);
    }

    public static void main(String[] args) {
//        无法访问默认权限的属性
//        System.out.println(VistorTest1.i);
        System.out.println(VistorTest1.j);

        VistorTest1 vt1 = new VistorTest1(10);
        System.out.println(vt1.j);
    }
}
