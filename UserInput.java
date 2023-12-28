// In order to read data from keyboard, java has a scanner class
// We have to make a scanner object to take input
// Scanner input = new Scanner(System.in);  Here System.in reads input from keyboard
// input.nextInt();   Method to read Integer from Keyboard


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Input 1: ");
        int n1 = input.nextInt();
        
        System.out.println("Enter Input 2: ");
        int n2 = input.nextInt();

        int sum = n1 + n2;
        System.out.println("Sum is: ");
        System.out.println(sum);

        System.out.println("Has Next");
        boolean b = input.hasNextInt();    // Return true if input is int; Similar for float, char etc
        System.out.println(b);
        
        boolean a = input.hasNext();
        System.out.println(a);
        
        System.out.println("Reading a String line");
        String sr = input.nextLine();
        System.out.println(sr);

        input.close();
    }
}
  