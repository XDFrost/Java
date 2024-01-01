import java.util.Scanner;


class Library {
    String[] available = new String[10000];
    String[] issued = new String[10000];
    int available_num;
    int issued_num;

    Library() {
        this.available_num = 0;
        this.issued_num = 0;
    }

    public void AddBook() {
        System.out.println();
        System.out.println();

        System.out.println("Add a book: ");
        Scanner inp = new Scanner(System.in);
        String book = inp.nextLine();
        
        this.available[available_num] = book;
        this.available_num++;
        System.out.println("Book added");
    }

    
    public void IssueBook() {
        System.out.println();
        System.out.println();
        
        System.out.println("Enter book to issue");
        Scanner inp = new Scanner(System.in);
        String book = inp.nextLine();
        
        for(int i = 0; i<this.available_num; i++) {
            if(book.equals(this.available[i])) {
                int j = i;
                while(j!=this.available_num) {
                    this.available[j] = this.available[j+1]; 
                    j++;
                }
                this.issued[issued_num] = book;
                this.issued_num++;
                System.out.println("Book issued");
                return;
            }
            continue;
        }
        System.out.println("Book not found");   
    }
    
    
    public void ReturnBook() {
        System.out.println();
        System.out.println();

        System.out.println("Enter book to return: ");
        Scanner inp = new Scanner(System.in);
        String book = inp.nextLine();

        for(int i = 0; i<this.issued_num; i++) {
            if(this.issued[i].equals(book)) {
                int j = i;
                while(j<this.issued_num) {
                    this.issued[j] = this.issued[j+1];
                    j++;
                }
                this.available[this.available_num] = book;
                this.available_num++;
                System.out.println("Book Returned");
                return;
            }
            continue;
        }
        System.out.println("Book not found");
    }


    public void ShowAvailableBook() {
        System.out.println();
        System.out.print("Available Books: ");
        for(int i = 0; i< this.available_num; i++) {
            if(this.available[i] == null) {continue;}
            else { System.out.print(this.available[i] + "  "); }
        }
    }
    

    public void ShowIssuedBook() {
        System.out.println();
        System.out.print("Issued Books: ");
        for(int i = 0; i< this.issued_num; i++) {
            if(this.issued[i] == null) {continue;}
            else { System.out.print(this.issued[i] + "  "); }
        }
    }
}


public class Online_Lib_problem {
    public static void main(String[] args) {
        /*
            Implement a library using Java Library Class
            Methods: AddBook, IssueBook, ReturnBook, ShowAvailableBook
            Properties: Array to store available books and array to store issued books
        */ 
        Library l = new Library();
        l.AddBook();
        l.AddBook();
        l.AddBook();
        l.AddBook();
        l.AddBook();
        l.AddBook();
        l.AddBook();
        l.AddBook();
        l.ShowAvailableBook();
        l.IssueBook();
        l.IssueBook();
        l.IssueBook();
        l.ShowAvailableBook();
        l.ShowIssuedBook();
        l.ReturnBook();
        l.ReturnBook();
        l.ShowAvailableBook();
        l.ShowIssuedBook();
    }
}
