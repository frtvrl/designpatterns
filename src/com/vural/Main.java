package com.vural;

import com.vural.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance("s1 created");
        Singleton s2 = Singleton.getInstance("s2 created");
        Singleton s3 = Singleton.getInstance("s3 created");


        System.out.println(s1.value + " " + "Hashcode: " + s1.hashCode());
        System.out.println(s2.value + " " + "Hashcode:" + s2.hashCode());
        System.out.println(s3.value + " " + "Hashcode:" + s3.hashCode());
    }
}
