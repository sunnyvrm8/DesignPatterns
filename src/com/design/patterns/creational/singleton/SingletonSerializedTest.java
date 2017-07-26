package com.design.patterns.creational.singleton;

/**
 * Created by sunny on 26/07/17.
 */
import java.io.FileInputStream; import java.io.FileNotFoundException; import java.io.FileOutputStream; import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream; import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
public class SingletonSerializedTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream( "filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream( "filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
    } }


    /*Output of the above program is;
    instanceOne hashCode=2011117821 instanceTwo hashCode=109647522
    So it destroys the singleton pattern, to overcome this scenario all we need
    to do it provide the implementation of readResolve() method. */
    //protected Object readResolve() { return getInstance();}
