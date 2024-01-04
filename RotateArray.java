class Rotate1D {
    // static public void Rotate1Darray(int arr[], int rotations) {                                     // Using static method
    public void Rotate1Darray(int arr[], int rotations) {                                               // Using non static method
        int addtolast[] = new int[arr.length - rotations];
        int addtofirst[] = new int[rotations];

        int index1 = 0;

        // Rotation logic
        for(int i = 0; i<arr.length; i++) {
            if(i<arr.length - rotations) {
                addtolast[i] = arr[i];
            }
            else {
                addtofirst[index1] = arr[i];
                index1++;
            }
        }

        int printindex = 0;

        // Print array
        for(int i = 0; i<arr.length; i++) {
            if(i<=rotations - 1) {
                System.out.print(addtofirst[i] + " ");
            }
            else {
                System.out.print(addtolast[printindex] + " ");
                printindex++;
            }
        }
    }
        
}


public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Rotate1D x = new Rotate1D();
        x.Rotate1Darray(arr, 4);                                        // Using non static method
        // Rotate1D.Rotate1Darray(arr, 4);                         // Using static method
    }
}
