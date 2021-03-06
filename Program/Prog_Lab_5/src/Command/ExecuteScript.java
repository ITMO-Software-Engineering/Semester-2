package Command;

import Collection.Exceptions.ParaIncorrectException;
import Manager.CommandManager;

public class ExecuteScript extends AbstractCommand {
    public ExecuteScript() {
        this.name = "execute_script";
        this.description = "Read and execute a script from the specified file. The script contains commands in the same form in which the user enters them interactively";
    }

    @Override
    public void execute(CommandManager commandManager, String[] para, String saver) {
        if (para.length > 2 || para.length == 1) {
            throw new ParaIncorrectException("Error: This command must accept only one parameter!\n");
        } else {
            commandManager.executeExecuteScript(para[1], commandManager, saver);
        }
    }
}
