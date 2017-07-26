package com.design.patterns.creational.builder;

/**
 * Created by sunny on 26/07/17.
 */
public class MyComputer {
    //required parameters
    private String HDD; private String RAM;
    //optional parameters
    private boolean isGraphicsCardEnabled; private boolean isBluetoothEnabled;
    public String getHDD() { return HDD;
    }
    public String getRAM() { return RAM;
    }
    public boolean isGraphicsCardEnabled() { return isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled() { return isBluetoothEnabled;
    }
    private MyComputer(MyComputerBuilder builder) { this.HDD=builder.HDD;
        this.RAM=builder.RAM; this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled; this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }
    //Builder Class
    public static class MyComputerBuilder{
        // required parameters
        private String HDD; private String RAM;
        // optional parameters
        private boolean isGraphicsCardEnabled; private boolean isBluetoothEnabled;
        public MyComputerBuilder(String hdd, String ram){ this.HDD=hdd;
            this.RAM=ram; }
        public MyComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this; }
        public MyComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this; }
        public MyComputer build(){ return new MyComputer(this);
        } }

    @Override
    public String toString() {
        return "MyComputer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
