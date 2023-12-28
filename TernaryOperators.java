public class TernaryOperators {
    public static void main(String[] args) {

        int n = 4;
        int result = 0;

        if(n%2 == 0) {
            result = 10;
        }
        else {
            result = 20;
        }
        System.out.println(result);


        // Using Ternary Operstor    =>       condition ? execute if true : execute if false 

        result = n%2==0 ? 10 : 20;
        System.out.println(result);
        
    }
}
