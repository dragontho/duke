package seedu.duke.commands;

import seedu.duke.util.Storage;
import seedu.duke.util.TaskList;
import seedu.duke.util.UI;

/**
 * Command that lists the current tasks in TaskList.
 */
public class ListCommand extends Command {

    /**
     * Displays TaskList to the user.
     *
     * @param tasks TaskList of tasks to be displayed.
     * @param ui UI to display TaskList to the user.
     * @param storage Not applicable.
     */
    @Override
    public String execute(TaskList tasks, UI ui, Storage storage) {
        return ui.showTaskList(tasks);
    }

}
