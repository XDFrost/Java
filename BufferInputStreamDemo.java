import java.io.*;

public class BufferInputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream f = new FileInputStream("BufferInputStream.txt");
             BufferedInputStream b = new BufferedInputStream(f);) {            
            // Printing the first chr from file
            // System.out.println((char) b.read());

            // Printing whole file
            int i = b.read();

            while(i != -1) {
                System.out.print((char) i);
                i = b.read();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
