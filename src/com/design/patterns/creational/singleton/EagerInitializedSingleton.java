package com.design.patterns.creational.singleton;

/**
 * Created by sunny on 20/07/17.
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}
    public static EagerInitializedSingleton getInstance(){ return instance;
    }
}