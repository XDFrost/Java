import java.util.Random;
import java.util.Scanner;

public class RockPaperSissor {
    public static void main(String[] args) {
        Random rand = new Random();
        int comp = rand.nextInt(3);       // 0 for rock; 1 for paper and 2 for scissors

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter \"r\" for Rock \nEnter \"p\" for Paper \nEnter \"s\" for Scissors");
        String user = inp.next();
        inp.close();

        if(comp == 0) {
            if(user.equals("r")) {
                System.out.println("Draw");
                System.out.println("Your choice: Rock");
                System.out.println("Computer's choice: Rock");
            }
            else if(user.equals("p")) {
                System.out.println("You won");
                System.out.println("Your choice: Paper");
                System.out.println("Computer's choice: Rock");
            }
            else if(user.equals("s")) {
                System.out.println("You lost");
                System.out.println("Your choice: Scissors");
                System.out.println("Computer's choice: Rock");
            }
            else {
                System.out.println("Enter valid input");
            }
        }
        
        else if(comp == 1) {
            if(user.equals("r")) {
                System.out.println("You lost");
                System.out.println("Your choice: Rock");
                System.out.println("Computer's choice: Paper");
            }
            else if(user.equals("p")) {
                System.out.println("Draw");
                System.out.println("Your choice: Paper");
                System.out.println("Computer's choice: Paper");
            }
            else if(user.equals("s")) {
                System.out.println("You won");
                System.out.println("Your choice: Scissors");
                System.out.println("Computer's choice: Paper");
            }
            else {
                System.out.println("Enter valid input");
            }
        }
        
        else {
            if(user.equals("r")) {
                System.out.println("You won");
                System.out.println("Your choice: Rock");
                System.out.println("Computer's choice: Scissors");
            }
            else if(user.equals("p")) {
                System.out.println("You lost");
                System.out.println("Your choice: Paper");
                System.out.println("Computer's choice: Scissors");
            }
            else if(user.equals("s")) {
                System.out.println("Draw");
                System.out.println("Your choice: Scissors");
                System.out.println("Computer's choice: Scissors");
            }
            else {
                System.out.println("Enter valid input");
            }
        }
    }
}
