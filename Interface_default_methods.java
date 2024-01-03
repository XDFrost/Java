// Interface Example
// Default methods are used so that we can define methods inside interfaces
/*
    Ex:

        interface A {
            default void method B() {
                method body
            }
        }
*/



interface Camera {
   void snap();
   void record();
   default void recordVid() {                                   // Default method in interface
        System.out.println("Recording from Camera interface");
   }
}


interface Wifi {
    String[] getNetworks();                          // Method to return an array of strings
    void ConnectToANetwork(String network);
}


class Cellphone {
    void Call(int Phn_num) {
        System.out.println("Calling " + Phn_num);
    }
    
    void Pickup() {
        System.out.println("Connecting...");
    }
    
}


class SmartPhone extends Cellphone implements Wifi, Camera{
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

    public void recordVid() {
        System.out.println("Recording from smartphone class");
    }
}


public class Interface_default_methods {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        String[] ar = s.getNetworks();

        for(String pr: ar) {
            System.out.println(pr);
        }

        s.recordVid( 
        );
    }
}
