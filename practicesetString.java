import java.util.Scanner;

public class practicesetString {
    public static void main(String[] args) {
        // 1 String to upper case
        String s = "First";
        System.out.println(s.toUpperCase());

        // 2 Replacing spaces with underscores
        String rep = "This is a string";
        System.out.println(rep.replace(" ","_"));

        // 3 Fill a name template
        Scanner name = new Scanner(System.in);
        String text = "Dear <!name!>, Thanks a lot";
        System.out.println(text.replace("<!name!>", name.next()));
        name.close();

        // 4 Detect double and triple spaces in a string
        String mystring = "This string contains double and  triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
    }   
}
