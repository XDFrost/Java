import java.util.*;

public class HashMapDemo {

    // putall() - Copies all of the mappings from the specified map to this map
    // Random order

    public static void main(String[] args) {    
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 9.22);
        hm.put("Ralph Smith", -19.08);

        System.out.println("Display the contents of the hashmap: " + hm);
        System.out.println();

        // Get a set of the entries
        // Set <Map.Entry<String, Double>> set = hm.entrySet();
        // System.out.println(set);      
        // for(Map.Entry<String, Double> me : set) {
        //     System.out.print(me.getKey() + ": ");
        //     System.out.println(me.getValue());
        // } 

        System.out.println();

        for(String s : hm.keySet()) {
            System.out.print(s + " : " + hm.get(s));
        }

        // Depositig 1000 into John Doe's account
        double balance = hm.get("John Doe");
        System.out.println("John Doe's old balance: " + hm.get("John Doe"));
        hm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " + hm.get("John Doe"));
    }
}
