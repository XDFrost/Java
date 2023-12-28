/*
                Data Types
    
    Values are called literals.
        
    Primitive   
    1. Integer - byte, short, int, long
    2. Float - double, float                                Double is by default in java
    3. Character - char 
    4. Boolean - true or false
    
    long l = 2345;                      Considered as int
    long l = 2345l;                     l should be used to consider it as long

    double num = 5.5                    Considered double
    float num = 5.5                     Alse considered double and hence will give error
    For float: float num = 5.5f

    char size = 2 bytes
    - Only one single character is accepted
    - Syntax: char ele = 'x'                  Only work with single quote

    boolean is only true and false, can't be 1 or 0


    Non Primitive: Derived from primitive data types
*/
 


public class Datatypes {
    public static void main(String[] args) {
        byte by = 1;
        short s = 557;
        long l = 34567l;
        int i = 123;

        double num1 = 4.4;
        float num2 = 9.9f;
        
        char x = 'w';
        
        boolean b = true;

        double num3 = 12e10;              // It is 12 x 10^10
        
        System.out.println(by + " " + s + " " + l + " " + i + " " + num1 + " " + num2 + " " + x + " " + b + " " + num3);
        
        x++;
        System.out.println(x);
    }
}
