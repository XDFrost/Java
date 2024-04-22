
import java.io.*;

public class ByteArrayInputStreamdemo {
    public static void main(String[] args) {
        byte[] buf = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
        ByteArrayInputStream b = new ByteArrayInputStream(buf);

        int i = 0;
        while ((i = b.read()) != -1){
            char ch = (char) i;
            System.out.println(i + " : " + ch);
        }
    }
}
