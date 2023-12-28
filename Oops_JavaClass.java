// One java file can have only one public class.


// public class Employee { }            // Gives error because one public class is already defined

import java.util.Scanner;

class Employee {
    int id;
    int salary;
    String name;

    public void get_details() {
        System.out.println("My name is: "+ name);
        System.out.println("My id is: "+ id);
    }

    // public int get_salary() {
    //     return salary;
    // }

    public void get_salary() {
        System.out.println("My salary is: " + salary);
    }

    public void set_details() {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter id number: ");
        this.id = inp.nextInt();

        inp.nextLine();
        
        System.out.println("Enter name: ");
        this.name = inp.nextLine();
        
        System.out.println("Enter salary: ");
        this.salary = inp.nextInt();

        inp.close();
    }
}

public class Oops_JavaClass {
    public static void main(String[] args) {
        Employee Frost = new Employee();                  // Instantiating a new Employee object
        // Employee John = new Employee();
        
        // Setting attributes for John
        // Frost.id = 1;
        // Frost.salary = 500000;
        // Frost.name = "Frost";
        Frost.set_details();
        Frost.get_details();
        Frost.get_salary();;
        
        
        // Setting attributes for Frost
        // John.id = 2;
        // John.salary = 100000;
        // John.name = "Jonathan";
        // John.get_details();
        // John.get_salary();;
    }
}
