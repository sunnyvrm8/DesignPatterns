package com.design.patterns.creational.abstractfactory;

/**
 * Created by sunny on 26/07/17.
 */
public class TestComputerAbstractFactory {
    public static void main(String[] args) { testAbstractFactory();
    }
    private static void testAbstractFactory() { Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB","2.9 GHz"));
                System.out.println("Factory PC Config: "+ pc); System.out.println("Factory Server Config:"+ server);
    }
}