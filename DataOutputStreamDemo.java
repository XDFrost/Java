import java.io.*;

public class DataOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream f = new FileOutputStream("data.txt");
        DataOutputStream d = new DataOutputStream(f);

        // d.writeInt(78);
        // d.writeDouble(56789);
        d.writeByte(66);
        d.writeChar('A');
        d.close();
    }
}
