package advanced.alfa.Final.model;

import advanced.alfa.Final.model.entity.Book;
import advanced.alfa.Final.view.BooksView;

import java.util.List;

public class SearchBooks {
    private BooksView printBooks = new BooksView();

    public void viewName(List<Book> booklist, String name){
        int cnt = 0;
        for (Book book : booklist)   {
            if (name.equals(book.getName())){
                ++cnt;
                printBooks.printBook(book);
            }
        }
        if (cnt <= 0)
            System.out.println("Нет книг с таким названием");
    }

    public void viewAuthor(List<Book> booklist, String author){
        int cnt = 0;
        for (Book book : booklist)   {
            if (author.equals(book.getName())){
                ++cnt;
                printBooks.printBook(book);
            }
        }
        if (cnt <= 0)
            System.out.println("Нет книг такого автора");
    }

    public void viewPublish(List<Book> booklist, String publish){
        int cnt = 0;
        for (Book book : booklist)   {
            if (publish.equals(book.getPublish())){
                ++cnt;
                printBooks.printBook(book);
            }
        }
        if (cnt <= 0)
            System.out.println("Нет книг данного издательства");
    }

    public void viewYear(List<Book> booklist, int year){
        int cnt = 0;
        for (Book book : booklist)   {
            if (year == (book.getYear())){
                ++cnt;
                printBooks.printBook(book);
            }
        }
        if (cnt <= 0)
            System.out.println("Нет книг позже данного года выпуска");
    }
}
