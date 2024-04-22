// Reading a single chr from file
import java.io.*;

public class InputStreamdemo1 {
    public static void main(String[] args) {
        // Creating an object of fileinputstream class
        try{
            FileInputStream f = new FileInputStream("StreamClasses.txt");
            int i = f.read();       // Read first chr from file ; Integer value is returned
            System.out.println((char) i);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
