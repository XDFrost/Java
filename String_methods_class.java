import java.util.*;

public class String_methods_class {
    public static void main(String[] args) {
        String str = "Tutorial";

        // CHARACTER EXTRACTION

        System.out.println(str.charAt(3));

        System.out.println();

        char[] arr = new char[8];
        str.getChars(2, 6, arr, 1);           // (start, end, targearray {char type}, targetStart) ; Target start is the index of storing for target array
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // System.out.println(arr);
        System.out.println("\n"); 

        byte[] arr1 = str.getBytes();           // Stores the result (ascii value) in a bytes array
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        char[] arr2 = str.toCharArray();
        for(char i : arr2) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // STRING EQUALITY

        String str1 = "Equals";
        String str2 = new String("equals");
        

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println();

        System.out.println(str1.regionMatches(1, str2, 1, 3));           // Compare a substring to another ; (1st string start index , 2nd string , 2nd string start index, no of chars)

        System.out.println();

        System.out.println(str1.startsWith("E", 0));            // Char to start with and index number at which char should be
        System.out.println(str1.endsWith("E"));

        System.out.println();

        // COMPARISON   

        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        
        System.out.println();

        String[] comp1 = {"new", "abstract", "class", "static"};
        for(int i = 0; i<comp1.length; i++) { 
            for(int j = i+1; j<comp1.length; j++) {
                if(comp1[i].compareTo(comp1[j]) < 0) {                       // compareTo compares one string with another ; Matches ascii value of characters, if 1st value is same for both, it'll check next 
                    String temp = comp1[i];
                    comp1[i] = comp1[j];
                    comp1[j] = temp;
                }
            }
        }
        for(String i: comp1) {
            System.out.print(i+ " ");
        }

        System.out.println("\n");
        
        // MODIFYING STRING
        
        System.out.println(str1.substring(1, 3));
        System.out.println(str1.concat(str2));
        System.out.println(str1.replace(str1, "newStr"));
        String trim = "                  Trimmed String          ";
        System.out.println(trim.trim())
        ;
        
        System.out.println();

        // CHANGING CHARACTER CASE

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println();

        // SEARCHING String

        System.out.println(str1.indexOf("l"));
        System.out.println(str1.lastIndexOf("s"));
    }
}
