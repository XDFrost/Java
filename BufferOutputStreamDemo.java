import java.io.*;

// Works similar as file output stream but it is used to write data to buffer ; It is faster than file output stream

public class BufferOutputStreamDemo {
    public static void main(String[] args) {
        String data = "This is a line of text inside the file."
        + "\n" 
        + "This is a second line of text inside the file."
        + "\n" 
        + "This is a third line of text inside the file.";

        byte[] barr = data.getBytes();

        try (FileOutputStream f = new FileOutputStream("BufferOutputStreamfile.txt");
            BufferedOutputStream b = new BufferedOutputStream(f);) {
            b.write(barr);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
