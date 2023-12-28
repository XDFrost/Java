public class ArrayPractice {
    public static void main(String[] args) {
        // 1 Sum of array of 5 floats
        float[] arr1 = {1.1f, 1.2f, 1.3f, 1.4f, 1.5f};

        float sum = 0;

        for(float ele: arr1) {
            sum+=ele;
        }
        System.out.println(sum);
    }
}
