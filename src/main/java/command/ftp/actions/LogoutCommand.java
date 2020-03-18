package command.ftp.actions;

import command.ftp.FtpCore;
import command.ftp.ICommand;

public class LogoutCommand implements ICommand {
    private FtpCore ftpCore;

    public LogoutCommand(FtpCore ftpCore) {
        this.ftpCore = ftpCore;
    }


    @Override
    public void execute(String name) {
        ftpCore.logout();
    }
}
