// Reading multiple chrs from file
import java.io.*;

public class InputStreamdemo2 {
    public static void main(String[] args) {
        // Creating an object of fileinputstream class
        try{
            FileInputStream f = new FileInputStream("StreamClasses.txt");
            byte[] barr = new byte[14];
            
            f.read(barr);        // Reading to a byte array

            for(byte b : barr) {
                System.out.print((char) b);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
