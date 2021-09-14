package com.vural.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton {
    private static Singleton singleton;
    public String value;

    private Singleton(String value) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {

        if (singleton == null) {
            singleton = new Singleton(value);
        }
        return singleton;
    }
}

class TestClass {
    static void useSingleton() {
        Singleton singleton = Singleton.getInstance("singleton instance");
        print("singleton", singleton);
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(TestClass::useSingleton);
        service.submit(TestClass::useSingleton);

        service.shutdown();


    }

    static void print(String name, Singleton object) {
        System.out.println(String.format("object: %s, Hashcode: %d", name, object.hashCode()));
    }
}
