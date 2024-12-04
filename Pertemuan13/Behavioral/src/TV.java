public class TV {
    private boolean isPoweredOn;

    public void turnOn() {
        isPoweredOn = true;
        System.out.println("TV is turned on.");
    }

    public void turnOff() {
        isPoweredOn = false;
        System.out.println("TV is turned off.");
    }

    public boolean isPoweredOn() {
        return isPoweredOn;
    }
}