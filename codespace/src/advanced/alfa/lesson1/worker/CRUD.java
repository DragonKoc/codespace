package advanced.alfa.lesson1.worker;
import advanced.alfa.lesson1.work1.Book;

public class CRUD {

    public Book[] createArrayBook (int a) {
        Book[] books = new Book[a];
        for (int i = 0; i < a; i++) {
            books[i] = new Book(1 + i, "name" + i, "Author" + i, "Publish" + i, 2001 + i, 101 + i, 1001 + i);
            System.out.println("original book, ID="+books[i].getId());
            books[i].viewBook();
        }
        return books;
        };

    public void increaseCost(Book[] books, double newcost) {
        for (Book book : books) {
            double costbook = book.getCost();
            book.setCost(costbook + costbook * newcost / 100);
            System.out.println("book with ID="+book.getId() +" with increase price");
            book.viewBook();
        }
    }




}
