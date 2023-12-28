public class typecasting {
    public static void main(String[] args) {
        // typecasting is explicit conversion i.e. we have to manually do it

        int a = 12;
        int b = 258;

        byte k1 = (byte) a;
        byte k2 = (byte) b;

        // Divides the numbers a and b by the byte range and gives the remainder

        System.out.println(k1);                 // will give 12 because 12 is in byte range 
        System.out.println(k2);                 // will give 1 because 156 is out of byte range i.e. 256
        
        float f = 12.2f;
        int i = (int) f;
        System.out.println(i);


        // type-promotions: When a value gets implicitly converted into another type
        // Ex: If we'll store a product of 2 byte vals in int out of byte range, it won't give error

        int result = a*b;
        System.out.println(result);
    }
}
