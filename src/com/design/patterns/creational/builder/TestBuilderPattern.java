package com.design.patterns.creational.builder;

/**
 * Created by sunny on 26/07/17.
 */
public class TestBuilderPattern {
    public static void main(String[] args) {
//Using builder to get the object in a single line of code and
//without any inconsistent state or arguments management issues
        MyComputer comp = new MyComputer.MyComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
        System.out.print(comp.toString());
    } }

