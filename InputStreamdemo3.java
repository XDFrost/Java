// Reading whole file
import java.io.*;

public class InputStreamdemo3 {
    public static void main(String[] args) {
        // Creating an object of fileinputstream class
        try{
            FileInputStream f = new FileInputStream("StreamClasses.txt");
            // byte[] barr = new byte[f.available()];
            // f.read(barr);
            // for (byte b : barr) {
            //     System.out.print((char)b);
            // }

            int i = f.read();
            while(i != -1) {
                System.out.print((char)i);
                i = f.read();
            }

            f.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
