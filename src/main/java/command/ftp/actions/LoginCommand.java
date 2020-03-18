package command.ftp.actions;

import command.ftp.FtpCore;
import command.ftp.ICommand;

public class LoginCommand implements ICommand {
    private FtpCore ftpCore;

    public LoginCommand(FtpCore ftpCore) {
        this.ftpCore = ftpCore;
    }


    @Override
    public void execute(String name) {
        ftpCore.login();
    }
}
