public class ForEachloop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr.length);                // returns array length
        
        System.out.println("Printing Array: ");               
        
        for(int element: arr) {
            System.out.print(element + " ");
        }
    }
}
