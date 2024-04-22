import java.io.*;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream f1 = new FileInputStream("BufferInputStream.txt");
             FileInputStream f2 = new FileInputStream("BufferOutputStreamfile.txt");
             SequenceInputStream s = new SequenceInputStream(f1, f2);) {

            int i = s.read();
            while(i != -1) {
                System.out.print((char) i);
                i = s.read();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
