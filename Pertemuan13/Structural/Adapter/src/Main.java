// Main.java
public class Main {
    public static void main(String[] args) {
        LegacyDevice legacyDevice = new LegacyDevice();
        ElectricDevice adapter = new LegacyDeviceAdapter(legacyDevice);

        adapter.powerOn();
        adapter.powerOff();
    }
}