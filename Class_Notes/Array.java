package Class_Notes;


import java.util.Scanner;

class min_ele {
    static void ret_min(int[] arr) {
        if(arr.length == 0) {System.out.println("Array of length 0");
            return;
        }
        if(arr.length == 1) {System.out.println(arr[0]);
            return;
        }

        int min = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(min>arr[i]) {min = arr[i];}
        }
        System.out.println(min);
    }
}

class array_2d {
    static void print() {
        // int[][] arr = new int[size][size];
        
        // int[][] arr = {
        //                 {1,2},
        //                 {4,5,6},
        //                 {7,8,9,8,9}
        //               };   
    //     System.out.println("Enter dimensions of the array: ");
    //     int size1, size2;
        
    //     Scanner inp = new Scanner(System.in);
    //     size1 = inp.nextInt();
    //     size2 = inp.nextInt();

    //     int[][] arr = new int[size1][size2];

    //     for(int i = 0; i<size1; i++) {
    //         for(int j = 0; j<size2; j++) {
    //             System.out.print("Enter element at position " + i + "," + j + ": ");
    //             arr[i][j] = inp.nextInt();
    //         }
    //         System.out.println();
    //     } 

        // for(int[] a: arr) {
        //     for(int b: a) {
        //         System.out.print(b + " ");
        //     }
        //     System.out.println();
        // }
    //     inp.close();
    }
}

class jagged_array{
    static void print() {

        System.out.println("Enter number of rows: ");
        
        Scanner inp = new Scanner(System.in);
        int size1 = inp.nextInt();

        int[][] arr = new int[size1][];

        for(int i = 0; i<size1; i++) {
            System.out.println("Enter number of elements for row " + (i + 1));
           
            int size2 = inp.nextInt();
            arr[i] = new int[size2];

            for(int j = 0; j<size2; j++) {
                System.out.print("Enter element " + j + ": ");
                arr[i][j] = inp.nextInt();
            }
            System.out.println();
        }
        
        for(int[] a: arr) {
            for(int b: a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
       
        inp.close();
    }
}

public class Array {
    public static void main(String[] args) {
        // System.out.println("Enter array size");
        // Scanner inp = new Scanner(System.in);
        // int s = inp.nextInt();

        // // int[] num = new int[s];
        // String[] st = new String[s]; 

        // for(int i = 0; i<s; i++) {
        //     System.out.print("Enter element at position " + (i+1) + ": ");
        //     // num[i] = inp.nextInt();
        //     st[i] = inp.nextLine();    
        // }

        // inp.close();
        // System.out.println();
        // for(String i : st) {System.out.print(i + " ");}

        // int[] arr = {8,70,6,5,94,13};
        
        // min_ele.ret_min(arr);
        // ret_max(arr);

        // array_2d.print();
        jagged_array.print();
    }

    static void ret_max(int[] arr) {
        if(arr.length == 0) {System.out.println("Array of length 0");
            return;
        }
        if(arr.length == 1) {System.out.println(arr[0]);
            return;
        }

        int max = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(max<arr[i]) {max = arr[i];}
        }
        System.out.println(max);
    }

}
