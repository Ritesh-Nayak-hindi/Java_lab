import java.util.Scanner;

class Book {
    String name;
    String author;
    int price;
    int num_pages;

    Book(Scanner sc) {
        System.out.println("ENTER THE NAME OF THE BOOK");
        this.name = sc.nextLine();

        System.out.println("ENTER THE NAME OF THE AUTHOR");
        this.author = sc.nextLine();

        System.out.println("ENTER THE PRICE OF THE BOOK");
        this.price = sc.nextInt();
        
        System.out.println("ENTER THE NUMBER OF PAGES IN THE BOOK");
        this.num_pages = sc.nextInt();
        sc.nextLine();
    }

    void get_details() {
        System.out.println("OBJECT DETAILS VIA get FUNCTION");
        System.out.println("BOOK_NAME: " + this.name);
        System.out.println("AUTHOR_NAME: " + this.author);
        System.out.println("BOOK_PRICE: " + this.price);
        System.out.println("NO_OF_PAGES_IN_BOOK: " + this.num_pages);
    }

  
    public String toString() {
        return ("OBJECT DETAILS VIA toString METHOD\n")
                + "BOOK_NAME: " + this.name + "\n"
                + "AUTHOR_NAME: " + this.author + "\n"
                + "BOOK_PRICE: " + this.price + "\n"
                + "NO_OF_PAGES_IN_BOOK: " + this.num_pages + "\n";
    }
}

public class labpro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF OBJECTS REQUIRED");
        int n = sc.nextInt();
        sc.nextLine();

        Book B[] = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Book " + (i + 1));
            B[i] = new Book(sc);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("THE DETAILS OF OBJECT " + (i + 1) + " ARE:");
            System.out.println(B[i].toString());
            System.out.println();
        }

        sc.close();
    }
}

