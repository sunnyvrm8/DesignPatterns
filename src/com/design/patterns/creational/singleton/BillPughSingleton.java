package com.design.patterns.creational.singleton;

/**
 * Created by sunny on 26/07/17.
 */
public class BillPughSingleton {
    private BillPughSingleton(){}
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new
                BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){ return SingletonHelper.INSTANCE;
    } }
