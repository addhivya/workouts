package Assignment2;


import java.io.File;
import java.io.IOException;

public class file {


        public static void main(String[] args) throws IOException {
            File file = new File("C:\\Users\\Divya\\Desktop\\Career Management\\abc.txt");
            file.createNewFile();

          /*  file = new File("/Users/sdosapati/abc/xyz/123");
            file.mkdirs();
*/
        }

    }

