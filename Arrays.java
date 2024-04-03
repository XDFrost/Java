// Mutable; Value can be changed
// Array creation:
    // 1 Declaration + memory allocation
    // 2 Declaration + memory allocation + initialization


public class Arrays {
    public static void main(String[] args) {
        // 1
        int[] marks_arr = new int[5];              // Syntax:   datatype[] array_name = new datatype[size];       new int[5] => Memory Allocation
        marks_arr[0] = 100;                        // Value stored at index 0
        marks_arr[1] = 200;                        
        marks_arr[2] = 300;                        
        marks_arr[3] = 400;                        
        marks_arr[4] = 500;  
        
        System.out.println(marks_arr[2]);
        System.out.println("Printing array: ");
        
        for(int i = 0; i<5; i++) {
            System.out.print(marks_arr[i] + " ");
        }
        
        System.out.println();

        // 2
        int[] marks = {10,20,30,40,50};
        System.out.println("Printing array: ");

        for(int i = 0; i<5; i++) {
            System.out.print(marks[i] + " ");
        }
    }

    public static void sort(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}
