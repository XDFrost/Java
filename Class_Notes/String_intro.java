package Class_Notes;

// Part of lang package which is implicitly immported
// Classes to update string:
    // 1. Make a new string
    // 2. String buffer class
    // 3. String builder class

public class String_intro {
    public static void main(String[] args) {
        // Creating string literal    :      Directly assigning value
        // Considered as object

        String str1 = "First string"; 
        String str2 = "Second String"; 
        String str3 = "Third String"; 

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println();

        // Cncatenating string
        int num = 10;
        System.out.println(num+str1);

        System.out.println();

        // Length of string
        System.out.println(str1.length());
    
        System.out.println();

        // Finding a particular character
        System.out.println(str1.charAt(4));

        System.out.println();

        // Checking equality
        if(str1.equals(str2))
            System.out.println("str1 == str2");
        else
            System.out.println("NOT EQUALS");
    
        System.out.println();

        
        String[] arr = {"One", "Two", "Three"};
        for(String i : arr) {
            System.out.println(i);
        }
    }
}
