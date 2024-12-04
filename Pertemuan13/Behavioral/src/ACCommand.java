public class ACCommand implements Command {
    private AC ac;
    private int prevTemperature;

    public ACCommand(AC ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        prevTemperature = ac.getTemperature();
        ac.setTemperature(24);
    }

    @Override
    public void undo() {
        ac.setTemperature(prevTemperature);
    }
}