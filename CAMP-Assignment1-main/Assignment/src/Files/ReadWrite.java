package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) throws IOException
    {
        FileInputStream fs1 = null;
        FileOutputStream fs2 = null;
        try {
            fs1 = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\input.txt");
            fs2 = new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\output.txt");
            int c;
            while ((c = fs1.read()) != -1) {
                fs2.write(c);
            }
            System.out.println("Read write completed successfully!!!");
        }
        finally {
            if (fs1 != null) {
                fs1.close();
            }
            if (fs2 != null) {
                fs2.close();
            }
        }
    }
}
