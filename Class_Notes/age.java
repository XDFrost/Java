package Class_Notes;


import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);   
        int a = inp.nextInt();
        inp.close();

        if(a >= 18) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
