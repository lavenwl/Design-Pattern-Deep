package command.ftp.actions;

import command.ftp.FtpCore;
import command.ftp.ICommand;

public class UploadCommand implements ICommand {
    private FtpCore ftpCore;

    public UploadCommand(FtpCore ftpCore) {
        this.ftpCore = ftpCore;
    }


    @Override
    public void execute(String name) {
        ftpCore.upload(name);
    }
}
