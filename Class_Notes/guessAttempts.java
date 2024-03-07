package Class_Notes;


import java.util.Scanner;
import java.util.Random;



public class guessAttempts {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        int count = 0;

        do {
            System.out.println("Enter the number");
            int num = inp.nextInt();
            if(randomNum == num) {
                System.out.println("You won");
                return;
            }
            else if(randomNum < num) {
                System.out.println("Enter a smaller number");
                count++;
            }
            else {
                System.out.println("Enter a larger number");
                count++;
            }
        } while(count < 5);
        System.out.println("You lost");
    }
}
