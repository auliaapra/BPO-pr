import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commands = new ArrayList<>();
    private Command lastExecutedCommand;

    public void pressButton(int index) {
        commands.get(index).execute();
        lastExecutedCommand = commands.get(index);
    }

    public void undo() {
        if (lastExecutedCommand != null) {
            lastExecutedCommand.undo();
        }
    }

    public void addCommand(Command command) {
        commands.add(command);
    }
}