// LegacyDeviceAdapter.java
public class LegacyDeviceAdapter implements ElectricDevice {
    private LegacyDevice legacyDevice;

    public LegacyDeviceAdapter(LegacyDevice legacyDevice) {
        this.legacyDevice = legacyDevice;
    }

    @Override
    public void powerOn() {
        legacyDevice.turnOn();
    }

    @Override
    public void powerOff() {
        legacyDevice.turnOff();
    }
}