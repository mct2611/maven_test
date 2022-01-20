package com.ale;

import com.google.inject.Inject;

public class Object1 {

    private String name;
    private Util1 util1;
    private Util2 util2;

    @Inject
    public Object1(String name, Util1 util1, Util2 util2) {
        this.name = name;
        this.util1 = util1;
        this.util2 = util2;
    }

    public void doSome1() {
        util1.doSome();
    }

    public void doSome2() {
        util2.doSome();
    }

//    public static void main(String[] args) {
//        Object1 obj = new Object1("zhangsan", new Util1());
//        obj.doSome();
//    }

}
