public class pascaltri {
    public static void main(String[] args) {
        int rows = 5; // Number of rows to print

        for(int i = 0; i < rows; i++) { // Loop through each row
            int number = 1; // Start with 1 for each row
            System.out.format("%"+(rows-i)*2+"s",""); // Print space for formatting

            for(int j = 0; j <= i; j++) { // Loop through each element in the row
                System.out.format("%4d",number); // Print the number
                number = number * (i - j) / (j + 1); // Calculate the next number in row
            }

            System.out.println(); // Move to the next line after printing all numbers in a row
        }
    }
}