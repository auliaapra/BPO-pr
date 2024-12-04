public class AC {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("AC temperature set to " + temperature + "\u00B0C.");
    }

    public int getTemperature() {
        return temperature;
    }
}