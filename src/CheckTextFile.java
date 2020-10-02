import java.io.File;
import java.io.IOException;

public class CheckTextFile {
    public static void checkFile(String pathname) throws IOException {
        File checkFile = new File(pathname);
        if (!checkFile.exists()) {
            checkFile.createNewFile();
        } else {
            System.out.println("[" + pathname + "]" + " - This file was created! Please using other name!");
            System.exit(0);
        }
    }
}
