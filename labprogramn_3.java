import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {

        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;

    }

    public String toString() {

        String name, author, price, numPages;
        name = "Book name: " + this.name + "\n";
        author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
        numPages = "Number of pages: " + this.numPages + "\n";
        return name + author + price + numPages;
    }

}

public class labprogramn_3{
    public static void main(String arg[]) {
        System.out.println("Enter no of members");
        Scanner s = new Scanner(System.in);
        int n;
        String name;
        String author;
        int price;
        int numPages;
        n = s.nextInt();
        Books b[];
        b = new Books[n];
        for (int i = 0; i < n; i++) {

            System.out.println("Enter the Name");
            name = s.next();
            System.out.println("Enter Author Name");
            author = s.next();
            System.out.println("Enter Book Price");
            price = s.nextInt();
            System.out.println("Enter no of pages");
            numPages = s.nextInt();
            b[i] = new Books(name, author, price, numPages);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
}
