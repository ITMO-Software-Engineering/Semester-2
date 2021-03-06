package Command;

import Collection.Exceptions.ParaIncorrectException;
import Manager.CommandManager;

public class Show extends AbstractCommand {
    public Show() {
        this.name = "show";
        this.description = "Print to standard output all elements of the collection in string representation";
    }

    @Override
    public void execute(CommandManager commandManager, String[] para, String saver) {
        if (para.length > 1) {
            throw new ParaIncorrectException("Error [show]: This command doesn't accept any parameter!\n");
        }else {
            commandManager.executeShow();
        }
    }
}
