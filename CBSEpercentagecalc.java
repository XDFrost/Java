import java.util.Scanner;


public class CBSEpercentagecalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Total Subjects: ");
        int sub = in.nextInt();
        System.out.println("Enter marks for each subject: ");
        float res = 0;

        for(int i = 0; i<sub; i++) {
            res+=in.nextInt();
        }

        res = (res/(sub*100))*100;

        System.out.println("Percentage: ");
        System.out.println(res);

        in.close();
    }
}
 