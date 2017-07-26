package com.design.patterns.creational.singleton;

/**
 * Created by sunny on 20/07/17.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}
    public static synchronized ThreadSafeSingleton getInstance(){ if(instance == null){
        instance = new ThreadSafeSingleton(); }
        return instance; }

        //double checked locking
        /*public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){ if(instance == null){
            synchronized (ThreadSafeSingleton.class) { if(instance == null){
                instance = new ThreadSafeSingleton(); }
            } }
            return instance; }*/

}
