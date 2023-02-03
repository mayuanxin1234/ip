package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

/**
 * AddCommand class that encompasses the todo, deadline, event commands
 */
public class TagCommand extends Command {
    protected String[] s;
    protected int taskNumber;

    /**
     * Creates a new AddCommand object that has takes note of the full command and the command separated by a space
     * @param fullCommand input by user
     * @param s parsed command with spaces removed
     */
    public TagCommand(String[] s, int taskNumber) {
        this.taskNumber = taskNumber;
        this.s = s;
    }

    /**
     * A method that performs the desired action of the command
     * @param tasks the TaskList class that keeps track of the tasks
     * @param ui User Interface controlling what gets shown on the screen
     * @param storage Storage class that handles the file input and output (saving)
     * @throws DukeException
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        String tagName = "";
        for (int i = 2; i < s.length; i++) {
            tagName += s[i];
            tagName += " ";
        }
        return tasks.tag(tagName, taskNumber);
    }

    /**
     * Tests if at end of command stack
     *
     * @return false if not at end, true if no more commands left
     */
    @Override
    public boolean isExit() {
        return false;
    }
}
