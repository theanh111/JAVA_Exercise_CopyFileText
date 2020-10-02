import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("* Input source file name: ");
        String sourceFilePathName = input.nextLine();
        System.out.println("* Input target file name: ");
        String targetFilePathName = input.nextLine();

        checkFile(sourceFilePathName);
        checkFile(targetFilePathName);

        FileWriter sourceFileWriter = new FileWriter(sourceFilePathName);
        System.out.println("- Input info for " + "[" + sourceFilePathName + "]");
        String sourceFileInfo = input.nextLine();
        sourceFileWriter.write(sourceFileInfo);
        System.out.println(" -> Your info you was input for " + "[" + sourceFilePathName + "] is: \n" + "'" + sourceFileInfo + "'");
        sourceFileWriter.close();

        FileReader sourceFileReader = new FileReader(sourceFilePathName);
        FileWriter targetFileWriter = new FileWriter("target.txt");
        BufferedReader bufferedReader = new BufferedReader(sourceFileReader);
        System.out.println("Copying info from " + "[" + sourceFilePathName + "]" + " to " + "[" + targetFilePathName + "]...");

        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            targetFileWriter.write(line);
        }


        bufferedReader.close();
        sourceFileReader.close();
        targetFileWriter.close();


        FileInputStream inputStream = new FileInputStream("target.txt");
        int count = 0;
        while (inputStream.read() != -1) {
            count++;
        }

        System.out.println("Number character in " + "target.txt is: " + count);
    }

    public static void checkFile(String pathname) throws IOException {
        File checkFile = new File(pathname);
        if (!checkFile.exists()) {
            checkFile.createNewFile();
        } else {
            System.out.println("[" + pathname + "]" + " - This file was created!");
            System.exit(0);
        }
    }
}
