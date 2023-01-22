public class ListCommand extends Command{

    public String fullCommand;
    public ListCommand(String fullCommand) {
        this.fullCommand = fullCommand;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        tasks.printList();
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
