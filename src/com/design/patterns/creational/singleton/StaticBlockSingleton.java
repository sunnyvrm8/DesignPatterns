package com.design.patterns.creational.singleton;

/**
 * Created by sunny on 20/07/17.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance; private StaticBlockSingleton(){}
    //static block initialization for exception handling
    static{ try{
        instance = new StaticBlockSingleton(); }catch(Exception e){
        throw new RuntimeException("Exception occured in creating singleton instance");
    } }
    public static StaticBlockSingleton getInstance(){ return instance;
    }
}
