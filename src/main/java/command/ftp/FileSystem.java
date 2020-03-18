package command.ftp;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private static List<String> fileLists;

    static {
        fileLists = new ArrayList<String>();
        fileLists.add("root");
        fileLists.add("user");
    }

    public void create(String name) {
        fileLists.add(name);
    }

    public void delete(String name) {
        fileLists.remove(name);
    }

    public void fileList() {
        for (int i = 0; i < fileLists.size(); i++) {
            System.out.println(fileLists.get(i));
        }
    }
}
