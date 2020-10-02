import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {
    public void writerTextFile(String pathname, String line) {
        try {
            FileWriter fileWriter = new FileWriter(pathname);
            fileWriter.write(line);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
