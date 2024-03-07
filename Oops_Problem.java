import java.util.Scanner;
import java.util.Random;


class GuessTheNum {
    private int guess;
    private int numbrOfGuesses = 1;
    private int randomNum;

    public GuessTheNum() {                  // Constructor generating random num
        Random rand = new Random(); 
        this.randomNum = rand.nextInt(100) + 1;             // 1 will be added to the range of 0-99 and will increment the range to 1-100
    }

    public void isCorrectNum() {
        if(guess == randomNum) {
            System.out.println("You won");
            System.out.println("Number of guesses: " + numbrOfGuesses);
        }
        
        else {
            numbrOfGuesses++;
            if(guess > randomNum) {
                System.out.println("Enter a smaller number");
                TakeUserInput();
            }
            else {
                System.out.println("Enter a bigger number");
                TakeUserInput();
            }
        }
    }

    public void TakeUserInput() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        this.guess = inp.nextInt();

        isCorrectNum();
        inp.close();
    }
}

public class Oops_Problem {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows user to play "Guess the number" game once.
            Methods:
            1. Constructor to generate random num
            2. TakeUserInput() for user input
            3. isCorrectNum() to check if number is correct
            4. Getter and setter for number of guesses
            Make properties numberOfGuesses(int) 
        */
        GuessTheNum x = new GuessTheNum();
        x.TakeUserInput();
    }
}
