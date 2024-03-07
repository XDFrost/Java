public class MutliThreading extends Thread {
    public static void main(String[] args) {
        Thread t = new MutliThreading();
        System.out.println("Current Thread: " + t);
        
        System.out.println("Old name: " + t);
        t.setName("My_Thread");
        System.out.println("New name: " + t.getName());
        
        System.out.println("Current Thread: " + t);

        for(int i = 1; i<=5; i++) {
            System.out.println(i);
            try {
                
                Thread.sleep(1000);                                     // Sleep for 1 second; 1000 is milliseconds ; We'll get unhandled exception error so we'll have to use try-catch
                }
            catch (Exception e) {
                System.out.println("Thread Interrupted: " + e);
            }
            System.out.println("Current Thread: " + t.getName());
            System.out.println("Current Thread: " + t);
            System.out.println("Current Thread: " + t.currentThread());
        }
    }
}

// Currenthread: Thread[Thread-0,5,main] 1
// In above, Thread-0 is the name of the thread, 5 is the priority of the
// thread, and main is the name of the thread again
