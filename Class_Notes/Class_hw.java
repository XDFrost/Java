package Class_Notes;


class N_natural_sum {
    static void sum(int range) {
        int sum = 0;
        for(int i = 1; i<=range; i++) {
            sum+=i;
        }

        System.out.println("Sum is: " + sum);
    }
}

class N_table {
    static void table(int num) {
        for(int i = 1; i<=10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    } 
}

public class Class_hw {
    public static void main(String[] args) {
        // N_natural_sum.sum(4);      
        // N_table.table(9);  
    }
}
