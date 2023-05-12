package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        //obj.name="name";

        // Error: java: name has private access in com.driver.RWOnly

        obj.setName("NAME");
        System.out.println(obj.getName());
    }
}