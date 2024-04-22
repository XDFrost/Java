import java.io.*;

public class OutputStreamDemo1 {
    public static void main(String[] args) {
        String data = "This is a line of text inside the file."
        + "\n" 
        + "This is a second line of text inside the file."
        + "\n" 
        + "This is a third line of text inside the file.";

        try (FileOutputStream f1 = new FileOutputStream("OutputStreamfile1.txt");           // try with resources ; file with automatically close
            FileOutputStream f2 = new FileOutputStream("OutputStreamfile2.txt");
            FileOutputStream f3 = new FileOutputStream("OutputStreamfile3.txt");)
            {
            
            byte[] barr = data.getBytes();

            // Write to file1
            for (int i = 0; i<barr.length; i+=2) {
                f1.write(barr[i]);
            }

            // Write to file2
            f2.write(barr);

            // Write to file3
            f3.write(barr, 10, 12);  // Write first 10 chrs to file3 ; (array ; startindex ; length)
        }        
        catch(Exception e) {
            System.out.println(e);
        }
    }   
}
