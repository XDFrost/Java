// Thread states : 

/**
 * 1. new
 * 2. running
 * 3. sleeping
 * 4. resumed
 * 5. blocked
 * 6. Terminated
 **/

// Java assigns priority to threads from 1 to 10. 1 being the lowest and 10
// being the highest.
// if multiple threads have the same priority, round robin scheduling is used.

// context switching is the process of storing and restoring the state of a
// thread so that execution can be resumed from the same point at a later time.
// Rules:
// 1. A thread can voluntarily relinquish control by calling the sleep() method.
// 2. A thread can be preempted by a higher priority thread.

// To achieve synchronization, we use monitor.
// Monitor is a mechanism that is used to achieve synchronization in Java.
// Every object in Java has a monitor associated with it ; THERE IS NO MONITOR
// CLASS IN JAVA
// Only one thread can own a monitor at a time.

// In order to use monitor, we use synchronized keyword.

// In order to use multithreading, we use Thread class or Runnable interface

// Once a java program starts, one thread begins running immediately. This is
// usually called the main thread of the program.
// The main thread is important because it is the thread from which other
// "child" threads will be spawned.
// The main thread runs at first and also at last

// Order can be different in different runs of the program

// isAlive() is boolean 

// join() waits until the thread on which it is called; it is static
//  Syntax: static void join()

// EXTENDING THREAD CLASS

class threading2 extends Thread {
    public void run() {
        System.out.println("Thread is running");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Currenthread: " + Thread.currentThread() + " " + i);
            System.out.println("Currenthread ID: " + Thread.currentThread().getId() + " " + i);
        }
    }
}

// IMPLEMENTING RUNNABLE INTERFACE

class threading3 implements Runnable {
    public void run() {
        System.out.println("Thread is running");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Currenthread: " + Thread.currentThread() + " " + i);
            System.out.println("Currenthread ID: " + Thread.currentThread().getId() + " " + i);
        }
    }
}

// EX

class newThread extends Thread {
    newThread() {
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting Child Thread");
    }
}

class imple implements Runnable {
    Thread t;

    imple() {
        t = new Thread(this, "Demo Thread"); // this is the reference to the current object; this referes to the run
                                             // method of current class ; if this is not used, run method won't be
                                             // overridden and the code will be executed in the main thread
        System.out.println("Child Thread: " + t.getName());
        t.start();
    }

    // Parameterized constructor for naming mltiple threads
    String name;
    imple(String Threadname) {
        name = Threadname;
        t = new Thread(this, name); 
        System.out.println("Child Thread: " + t.getName());
        t.start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Interrupted");
        }
        System.out.println("Exiting " + name);
    }
}

public class threadingl {
    public static void main(String[] args) {
        // threading2 t1 = new threading2();
        // threading3 t2 = new threading3();
        // t1.start();
        // t1.run();
        // t2.start();
        // t2.run();

        // for (int i = 1; i <= 5; i++) {
        // System.out.println("Currenthread: " + Thread.currentThread() + " " + i);
        // System.out.println("Currenthread ID: " + Thread.currentThread().getId() + " "
        // + i);
        // }

        // newThread t3 = new newThread();
        // new newThread();

        // for (int i = 1; i <= 5; i++) {
        // try {
        // System.out.println("Main Thread: " + i);
        // Thread.sleep(1000);
        // }
        // }
        // catch (InterruptedException e) {
        // System.out.println("Main Interrupted");
        // }
        // System.out.println("Exiting main Thread");
        // new imple();
        // try {
        //     for (int i = 1; i <= 5; i++) {
        //         System.out.println("Main Thread: " + i);
        //         Thread.sleep(1000);
        //     }
        // } catch (InterruptedException e) {
        //     System.out.println("Main Interrupted");
        // }
        // System.out.println("Exiting main Thread");


        // Using parameter
        imple obj1 = new imple("This is parameter A");
        imple obj2 = new imple("This is parameter B");
        imple obj3 = new imple("This is parameter C");

        System.out.println(obj1.t.isAlive());
        System.out.println(obj2.t.isAlive());
        System.out.println(obj3.t.isAlive());

        // JOINING MAIN THREAD AT END
        System.out.println("WAITING FOR OTHER THREADS TO GET EXECUTED");
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Exception");
        }

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Interrupted");
        }
        System.out.println("Exiting main Thread");

        System.out.println(obj1.t.isAlive());
        System.out.println(obj2.t.isAlive());
        System.out.println(obj3.t.isAlive());
    }
}

// Currenthread: Thread[main,5,main] 1
// In above, main is the name of the thread, 5 is the priority of the thread,
// and main is the name of the thread again

// Currenthread: Thread[Thread-0,5,main] 1
// In above, Thread-0 is the name of the thread, 5 is the priority of the
// thread, and main is the name of the thread again
