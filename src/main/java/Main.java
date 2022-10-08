import java.io.*;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        File file = new File("names.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream inputStream = new FileInputStream(file)) {
            int number = inputStream.read();
            while (number != -1) {
                System.out.print((char) number);
                number = inputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
