import java.io.*;
import java.util.Vector;
import java.util.Enumeration;

public class enumeration_input_stream {
    public static void main(String[] args) {
        try (FileInputStream f1 = new FileInputStream("BufferInputStream.txt");
             FileInputStream f2 = new FileInputStream("BufferOutputStreamfile.txt");
             FileInputStream f3 = new FileInputStream("BufferInputStream.txt");) {

            Vector<FileInputStream> v = new Vector<FileInputStream>();
            v.add(f1);
            v.add(f2);
            v.add(f3);


            Enumeration<FileInputStream> e = v.elements();
            SequenceInputStream s = new SequenceInputStream(e);

            
            int i = s.read();
            while(i != -1) {
                System.out.print((char) i);
                i = s.read();
            }

            s.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
