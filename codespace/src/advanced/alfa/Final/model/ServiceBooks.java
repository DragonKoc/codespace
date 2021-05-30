package advanced.alfa.Final.model;

import advanced.alfa.Final.model.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class ServiceBooks {
    private List<Book> booklist;

    public ServiceBooks(){
        booklist = SourceBooks.generateBooks();
    }

    public List<Book> getBookList(){
        return  (List<Book>)(new ArrayList<Book>(booklist).clone());
    }

    public void addBook(String name, String author, String publish, int year, int countPages, double cost){
        booklist.add(new Book(name,author,publish,year,countPages,cost));
    }

    public void increaseCostAll(List<Book> booklist, double newcost) {
        for (Book elem : booklist) {
            double costbook = elem.getCost();
            elem.setCost(costbook + costbook * newcost / 100);
        }
        System.out.println("All books increase price");
    }

    public void increaseCostBook(Book book, double newcost) {
            double costbook = book.getCost();
            book.setCost(costbook + costbook * newcost / 100);
        System.out.println("Book " + book.getName() + " increase price");
        }

}
