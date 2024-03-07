package Class_Notes;

// Prevent method overridding
// Prevent inheritance

// A class can't be bot abstract and final at same time


final class fig {
    fig(int a, int b) {
        System.out.println("Values: " + a + b);
    }

    void display() {
        System.out.println("FIG CLASS");
    }
}

// class imple extends fig{                                         // Gives error because final prohibits inheritance
//     imple(int x, int y) {
//         System.out.println("Implementation");
//     }
// }

public class final_ {
    public static void main(String[] args) {
        
    }
}


