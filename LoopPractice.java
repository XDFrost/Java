import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // 1 Pattern
        System.out.println("Enter num for problem 1: ");
        int num = inp.nextInt();
        for(int i = 0; i<num; i++) {
            for(int j = num; j>i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2 Sum of first n even numbers using while loop
        System.out.println("Enter num for problem 2: ");
        int e = inp.nextInt();
        int x = 2;
        int sum = 0;
        while(x<=e) {
            sum+=x;
            x+=2;
        }
        System.out.println(sum);

        inp.close();
    }
}
