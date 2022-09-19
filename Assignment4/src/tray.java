import java.nio.file.Path;
import java.util.HashMap;
import java.util.Stack;

public class tray {
    //Stack<String> filePath;
    String filePath;
    HashMap <String, folder> hashMap ;

    public tray(Path folderList) {
       this.filePath = String.valueOf(folderList);
       System.out.println(filePath);
    }
}
