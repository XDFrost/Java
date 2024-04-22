import java.io.*;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream f1 = new FileOutputStream("bytearray1.txt");
        FileOutputStream f2 = new FileOutputStream("bytearray2.txt");
        ByteArrayOutputStream b = new ByteArrayOutputStream();

        b.write(65);
        b.writeTo(f1);
        b.writeTo(f2);

        b.flush();          // clears b object
    }
}
