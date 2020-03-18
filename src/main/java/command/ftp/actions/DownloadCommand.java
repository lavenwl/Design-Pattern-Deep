package command.ftp.actions;

import command.ftp.FtpCore;
import command.ftp.ICommand;

public class DownloadCommand implements ICommand {
    private FtpCore ftpCore;

    public DownloadCommand(FtpCore ftpCore) {
        this.ftpCore = ftpCore;
    }


    @Override
    public void execute(String name) {
        ftpCore.download(name);
    }
}
