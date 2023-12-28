// Also called array of arrays


public class MultiDimensionalArray {
    public static void main(String[] args) {
        // int[] d1 = new int[5];                  // 1D Array
        int[][] d2 = new int[2][3];             // 2D Array; 2 are rows and 3 are columns
        d2[0][0] = 1;
        d2[0][1] = 2;
        d2[0][2] = 3;
        d2[1][0] = 4;
        d2[1][1] = 5;
        d2[1][2] = 6;

        for(int i = 0; i<2; i++) {
            for(int j = 0; j<3; j++) {
                System.out.print(d2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
