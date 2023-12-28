public class ConditionalStatements {
    public static void main(String args[]) {
        int x = 5; 
        int y = 7; 
        int z = 9; 
        boolean a = true;
        
        if(x>y && x>z) {
            System.out.println("X is " + x);
        }
        else if (y>x && y>z){
            System.out.println("Y is " + y);
        }
        else {
            System.out.println("Z is " + z);
        }

        System.out.println(!a);
    }
}
