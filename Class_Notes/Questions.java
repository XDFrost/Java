package Class_Notes;


import java.util.Scanner;

class isEven {
    static void check(int num) {
        if(num%2 == 0) {
            System.out.println("EVEN");
            return;
        }
        System.out.println("ODD");
    }
}

class leapyear {
    static void check(int year) {
        if(year % 4 == 0 || year % 400 == 0) {
            System.out.println("Leap year");
            return;
        }
        System.out.println("Not a leap year");
    }
}

class Calc {
    static void cal(int num1, int num2, String operator) {
        if(operator.equals("+")) {
            System.out.println("Sum is: " + (num1+num2));
            return;
        }

        else if(operator.equals("-")) {
            System.out.println("Difference is: " + (num1-num2));
            return;
        }

        else if(operator.equals("*")) {
            System.out.println("Product is: " + (num1*num2));
            return;
        }

        else if(operator.equals("/")) {
            System.out.println("Division is: " + (num1/num2));
            return;
        }
        System.out.println("Enter a valid operator");
    }
}

class fibo {
    static void series(int len) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println("Series: ");
        System.out.print(a + " " + b + " ");
        for(int i = 0; i<len - 2; i++) {
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

class Factorial {
    static void fac(int num) {
        int ans = 1;
        for(int i = 1; i<num+1; i++) {
            ans = ans * i;
        }
        System.out.println("Factorial is: " + ans);
    }
}

class Multiply {
    static void mul(int num) {
        for(int i = 1; i<=10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}

class hollow {
    static void rec(int num) {
        for(int i = 1; i<num; i++) {
            if(i == 1 || i == num - 1) {
                System.out.print("*".repeat(num));
            }
            else {
                System.out.print("* " + (" ".repeat(num - 4)) + " *");
            }
            System.out.println();
        }
    }
}

class pascal {
    static void triangle(int num) {
        for(int i = 1; i<num; i++) {
            for(int j = 0; j<num - i; j++) {
                System.out.println(" ");
            }
        }

        
    }
}

public class Questions {    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // 1. If number is even or odd
        // System.out.println("Enter a number");
        // int num = inp.nextInt();
        // isEven.check(num);
        
        // 2. If year is leap year
        // System.out.println("Enter a year");
        // int year = inp.nextInt();
        // leapyear.check(year);

        // 3. Simple Calculator
        // System.out.println("Entr number 1: ");
        // int num1 = inp.nextInt();
        // System.out.println("Entr number 2: ");
        // int num2 = inp.nextInt();
        // System.out.println("Enter operator: ");
        // String operator = inp.next();
        // Calc.cal(num1, num2, operator);

        // 4. Fibonacci series
        // System.out.println("Enter the length of Fibonacci series: ");
        // int len = inp.nextInt();
        // fibo.series(len);

        // 5. Factorial of a number
        // System.out.println("Enter a number: ");
        // int num = inp.nextInt();
        // Factorial.fac(num);
        
        // 6. Multiplication table
        // System.out.println("Enter a number: ");
        // int num = inp.nextInt();
        // Multiply.mul(num);
        
        // 7. Hollow rectangle
        // System.out.println("Enter a number: ");
        // int num = inp.nextInt();
        // hollow.rec(num);
        
        // 8. Pascal Triangle
        System.out.println("Enter a number: ");
        int num = inp.nextInt();
        pascal.triangle(num);

    }
}
