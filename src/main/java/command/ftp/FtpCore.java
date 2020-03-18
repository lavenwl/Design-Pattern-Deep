package command.ftp;

import composite.safecomposite.File;

public class FtpCore {
    /**
     * 1．FTP服务器的登陆
     * 匿名用户：FTP 口令：FTP
     * 用户：ANONYMOUS 口令：任何电子邮件
     * 2．显示文件信息：DIR/LS
     * 3．下载文件：GET 文件名（下载到当前目录）
     * 4．上传文件：PUT 文件名
     * 5．多文件下载：MGET
     * 6．多文件上传：MPUT
     * 7．退出：BYE
     * 8．帮助：HELP
     */

    FileSystem fileSystem;

    public FtpCore(FileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    public void login() {
        System.out.println("登录成功");
    }

    public void fileList() {
        System.out.println("文件列表:");
        fileSystem.fileList();
    }

    public void download(String name) {
        System.out.println("下载文件:" + name);
    }

    public void upload(String name) {
        System.out.println("上传成功:" + name);
        fileSystem.create(name);
    }

    public void logout() {
        System.out.println("退出成功");
    }

    public void help() {
        System.out.println("这里是帮助内容");
    }

}
