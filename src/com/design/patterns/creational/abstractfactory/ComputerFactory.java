package com.design.patterns.creational.abstractfactory;

/**
 * Created by sunny on 26/07/17.
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer(); }
}

