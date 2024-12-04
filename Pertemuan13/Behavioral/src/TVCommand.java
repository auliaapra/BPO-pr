public class TVCommand implements Command {
    private TV tv;
    private boolean prevPowerState;

    public TVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        prevPowerState = tv.isPoweredOn();
        tv.turnOn();
    }

    @Override
    public void undo() {
        if (prevPowerState) {
            tv.turnOn();
        } else {
            tv.turnOff();
        }
    }
}