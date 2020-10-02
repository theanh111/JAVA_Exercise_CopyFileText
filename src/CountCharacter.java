import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountCharacter {
    public static int countCharacter(String pathname) throws IOException {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(pathname);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int count = 0;
        while (inputStream.read() != -1) {
            count++;
        }
        return count;
    }
}
