package org.example;

public class SingletonDesign {
    private static SingletonDesign SingletonInstance;
    private SingletonDesign() {
    }
    public static SingletonDesign getInstance() {
        if(SingletonInstance == null) {
            SingletonInstance = new SingletonDesign();
        }
        return SingletonInstance;
    }
    public void SingletonMessage() {
        System.out.println("Singleton object Created");
    }
}
