package Command;

import Collection.Exceptions.ParaIncorrectException;
import Manager.CommandManager;

public class RemoveHead extends AbstractCommand {
    public RemoveHead() {
        this.name = "remove_head";
        this.description = "Print the first element of the collection and remove it";
    }

    @Override
    public void execute(CommandManager commandManager, String[] para, String saver) {
        if (para.length > 1) {
            throw new ParaIncorrectException("Error [remove_head]: This command doesn't accept any parameter!\n");
        }else {
            commandManager.executeRemoveHead();
        }
    }
}
