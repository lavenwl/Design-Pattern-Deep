package command.ftp;

import command.ftp.actions.*;

public class Test {
    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();
        FtpCore ftpCore = new FtpCore(fileSystem);

        new LoginCommand(ftpCore).execute("laven");
        new ListCommand(ftpCore).execute("usr");
        new UploadCommand(ftpCore).execute("myFile");
        new ListCommand(ftpCore).execute("usr");
        new DownloadCommand(ftpCore).execute("root");
        new HelpCommand(ftpCore).execute("ftp");
        new LogoutCommand(ftpCore).execute("laven");
    }
}
