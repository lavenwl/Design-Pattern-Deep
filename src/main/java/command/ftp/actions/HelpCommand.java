package command.ftp.actions;

import command.ftp.FtpCore;
import command.ftp.ICommand;

public class HelpCommand implements ICommand {
    private FtpCore ftpCore;

    public HelpCommand(FtpCore ftpCore) {
        this.ftpCore = ftpCore;
    }


    @Override
    public void execute(String name) {
        ftpCore.help();
    }
}
