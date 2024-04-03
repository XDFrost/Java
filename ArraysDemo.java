import java.util.Arrays;
import java.util.*;

public class ArraysDemo {
    
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i<10; i++) {
            arr[i] = -4*i;
        }
        
        printArray(arr);
        System.out.println();
        
        Arrays.fill(arr, 1, 4, 5);
        printArray(arr);
        System.out.println();

        Arrays.sort(arr);
        printArray(arr);
        System.out.println();

        System.out.println(Arrays.binarySearch(arr, 5));
    }
    
    static void printArray(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}