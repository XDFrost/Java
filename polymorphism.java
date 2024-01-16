// Polymorphism: Ability of an object to take many forms
// 1. Static polymorphism: Compile time polymorphism
// 2. Dynamic polymorphism: Runtime polymorphism

// Static polymorphism: Method overloading
// Dynamic polymorphism: Method overriding



interface Camera2 {
    void snap();
    void record();
    default void recordVid() {                                   // Default method in interface
         System.out.println("Recording from Camera interface");
    }
 }
 
 
 interface Wifi2 {
     String[] getNetworks();                          // Method to return an array of strings
     void ConnectToANetwork(String network);
 }
 
 
 class Cellphone2 {
     void Call(int Phn_num) {
         System.out.println("Calling " + Phn_num);
     }
     
     void Pickup() {
         System.out.println("Connecting...");
     }
     
 }
 
 
 class SmartPhone2 extends Cellphone2 implements Wifi2, Camera2{
     public void snap() {
         System.out.println("Taking a snap");
     }
     
     public void record() {
         System.out.println("Recording...");
     }
     
     public String[] getNetworks() {
         System.out.println("Getting a list of networks");
         String[] netList = {"Net 1", "Net 2", "Net 3",};
         return netList;
     } 
     
     public void ConnectToANetwork(String network) {
         System.out.println("Connecting to " + network);
     }
 
    //  public void recordVid() {
    //      System.out.println("Recording from smartphone class");
    //  }
 }


public class polymorphism {
    public static void main(String[] args) {
        Camera2 cam = new SmartPhone2();            // Creating a smartphone object with camera reference; Will only access camera methods
        // cam.getNetworks();       -->     not allowed
        cam.snap();
        cam.recordVid();
    }
}
