public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        AC ac = new AC();

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(new TVCommand(tv));
        remoteControl.addCommand(new ACCommand(ac));

        remoteControl.pressButton(0); // Turn on TV
        remoteControl.pressButton(1); // Set AC temperature to 24°C

        remoteControl.undo(); // Undo the last command (set AC temperature back)
    }
}