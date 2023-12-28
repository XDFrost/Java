// Constructor is a member function used to initialize a constructor while creating it
/* Ex:          
            Classname() {
                set attributes here
            }
*/
// Constructor overloading: Same as method overloading
// Works with arguments



class MainEmp {
    private int id;
    private String name;
    
    public MainEmp() {                                 // Constructor
        id = 34;
        name = "Your name";
    }
    
    public MainEmp(String n) {                                 // Constructor
        id = 34;
        this.name = n;
    }
    
    public MainEmp(String n, int i) {                                 // Constructor
        this.id = i;
        this.name = n;
    }

    public void setname(String n) {this.name = n;}
    public void setid(int i) {this.id = i;}
    public String getname() {return name;}
    public int getid() {return id;}
}


public class Constructors {
    public static void main(String[] args) {
        // MainEmp Frost = new MainEmp();
        MainEmp Frost = new MainEmp("Pratham");
        System.out.println("Example 1");
        System.out.println(Frost.getname());
        System.out.println(Frost.getid());

        System.out.println();
        
        System.out.println("Example 2");
        Frost.setname("Frost");
        System.out.println(Frost.getname());
        System.out.println(Frost.getid());
    }
}
 