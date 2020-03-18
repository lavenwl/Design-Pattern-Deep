package command.ftp.actions;

import command.ftp.FtpCore;
import command.ftp.ICommand;

public class ListCommand implements ICommand {
    private FtpCore ftpCore;

    public ListCommand(FtpCore ftpCore) {
        this.ftpCore = ftpCore;
    }


    @Override
    public void execute(String name) {
        ftpCore.fileList();
    }
}
