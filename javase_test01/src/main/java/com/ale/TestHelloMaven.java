package com.ale;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelloMaven {
    @Test
    public void TC_Add() {
        System.out.println("------------≤‚ ‘1------------");
        HelloMaven hm = new HelloMaven();
        int res = hm.add(10, 20);
        Assert.assertEquals(30, res);
    }
}
