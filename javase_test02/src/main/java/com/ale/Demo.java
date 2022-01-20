package com.ale;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Demo {
    public static void main(String[] args) {
        //test
        UtilModule utilModule = new UtilModule();
        Injector injector = Guice.createInjector(utilModule);
        Object1 object1 = injector.getInstance(Object1.class);
        object1.doSome1();
        object1.doSome2();
    }
}
