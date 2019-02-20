package Assignment7;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Problem2 {

    public static void parse(File file) throws IOException {

        RandomAccessFile input = null;
        String line = null;
        try {
            input = new RandomAccessFile(file, "rw");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
             //   input.writeChars(line);
            }
            return;
        }
        finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
