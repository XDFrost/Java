package Class_Notes;


import java.util.Scanner;
import java.util.Random;

class N_sum {
    static int sum(int n) {
        int sum = 0;
        for(int i = 1; i<=n; i++) {
            sum+=i;
        }
        return sum;
    }
}

class While {
    static int sum() {
        Scanner x = new Scanner(System.in);
        int inp = x.nextInt();
        x.close();

        int i = 1;
        int sum = 0;
        while(i <= inp) {
            sum+=i;
            i++;
        }
        return sum;
    }
}

class user {
    static void sum() {
        System.out.print("Enter number: ");
        Scanner x = new Scanner(System.in);
        int inp = x.nextInt();
        
        int sum = 0;
        
        while(inp!=0) {
            sum+=inp;
            System.out.println("Sum is: " + sum);
            System.out.print("Enter number: ");
            inp = x.nextInt();
        }
        
        System.out.println("Final sum: " + sum);
        x.close();
    }
}

class guess {
    Random ran = new Random();
    int random_num = ran.nextInt(100) + 1;
}

public class loop {
    public static void main(String[] args) {
        // System.out.println(N_sum.sum(10));
        // System.out.println(While.sum());
        user.sum();
    }
}
