public class printmethods {
    public static void main(String[] args) {
        String name = "Frost";

        System.out.println(name);           // Print a line after executing 
        
        System.out.print(name);             // Doesn't print a line after execution
        
        int a = 6;
        float b = 5.689f;
        System.out.printf("the value of a is %d and b is %f",a ,b);            // %d is used for int; %f is used for float; %c is used for char; %s is used for string 
        
        System.out.format("the value of a is %d and b is %f",a ,b);            // Same as printf
    }
}
