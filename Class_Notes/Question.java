package Class_Notes;

class Figure {
    int area;
    Figure(int a, int b) {
        area = a*b;
    }

    void area() {
        System.out.println("Figure Area ; No parameters passed");
    }
}

class Rectangle extends Figure{
    Rectangle(int a, int b) {
        super(a, b); 
    }

    @Override
    void area() {
        System.out.println("Rectangle area is: " + area);
    }
}

class Triangle extends Figure {
    Triangle(int a, int b) {
        super(a, b); 
    }

    @Override
    void area() {
        System.out.println("Triangle area is: " + area);
    }
}

public class Question {
    public static void main(String[] args) {
        Figure a = new Figure(2, 2);
        Rectangle b = new Rectangle(2, 2);
        Triangle c = new Triangle(2, 2);

        a.area();
        b.area();
        c.area();

        System.out.println();

        Figure d = new Rectangle(5, 5);
        d.area();

        System.out.println();

        Figure e = new Triangle(5, 6);
        e.area();
    }
}

