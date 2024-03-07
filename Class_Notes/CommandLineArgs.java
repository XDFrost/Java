package Class_Notes;


public class CommandLineArgs {
    public static void main(String[] args) {
        int n = args.length;
        if(n == 0)  
            System.out.println("Total Command Line Args: " + n);
        else {
            for(int i = 0; i<n; i++) {
                System.out.println(i + " ");
            }
        }
    }   
}
