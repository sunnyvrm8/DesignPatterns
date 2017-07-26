package com.design.patterns.creational.singleton;

/**
 * Created by sunny on 20/07/17.
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance; private LazyInitializedSingleton(){}
    public static LazyInitializedSingleton getInstance(){ if(instance == null){
        instance = new LazyInitializedSingleton(); }
        return instance; }
}