package duke.task;

/**
 * A Task class describing the tasks and keeping track of the task status whether is done or not.
 */
public class Task {
    protected String description;
    protected boolean isDone;
    protected String tag;

    /**
     * Creates a task object
     *
     * @param description the data to be stored
     */
    public Task(String description, String tag) {
        this.description = description;
        this.tag = tag;
        this.isDone = false;
    }

    /**
     * The status icon X or no icon if the task is done or not done
     *
     * @return a string of "X" or " "
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    /**
     * A method to mark the task as done
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * A method to unmark the task
     */
    public void unMark() {

        this.isDone = false;
    }
    public void tag(String tagName) {
        this.tag = tagName;
    }

    public boolean find(String word) {
        if (word.equals(this.description)) {
            return true;
        }
        return false;
    }

    /**
     * A toString method of the format [x] todo_task
     *
     * @return a string of above format
     */
    @Override
    public String toString() {
        if (this.tag == null) {
            return "[" + this.getStatusIcon() + "] " + this.description;
        }
        return "[" + this.getStatusIcon() + "] " + "#" + this.tag + this.description;
    }


}
