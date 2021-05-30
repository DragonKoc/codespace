package advanced.alfa.Final.controller;

import advanced.alfa.Final.model.SearchBooks;
import advanced.alfa.Final.model.ServiceBooks;
import advanced.alfa.Final.view.BooksView;
import advanced.alfa.Final.view.InputDataView;

public class BooksController {

    private BooksView printBooks;
    private ServiceBooks serviceBooks;
    private InputDataView dataView;
    private SearchBooks searchBook;

    public BooksController() {
        printBooks = new BooksView();
        serviceBooks = new ServiceBooks();
        dataView = new InputDataView(printBooks);
        searchBook = new SearchBooks();
    }

    public void execute() {
        while (true) {
            int menuItem = dataView.inputMenuItem();
            switch (menuItem) {
                case 0:
                    System.exit(0);
                case 1:
                    printBooks.printListBooks(serviceBooks.getBookList());
                    break;
                case 2:
                    inputAddBook();
                    break;
                case 3:
                    serviceBooks.increaseCostAll(serviceBooks.getBookList(), dataView.inputUserData());
                    break;
                case 4:
                case 5:
                    inputSearchData();
                    break;
                default:
                    printBooks.printMessage(BooksView.ERROR_ENTER);
            }
        }
    }

    private void inputAddBook() {
        String name = dataView.inputString(BooksView.ENTER_TITL);
        String author = dataView.inputString(BooksView.ENTER_AUTHOR);
        String publisher = dataView.inputString(BooksView.ENTER_PUBLISHER);
        String year = dataView.inputString(BooksView.ENTER_YEAR);
        String pages = dataView.inputString(BooksView.ENTER_PAGES);
        String cost = dataView.inputString(BooksView.ENTER_COST);
        serviceBooks.addBook(name, author, publisher, Integer.parseInt(year),
                Integer.parseInt(pages), Double.parseDouble(cost));
    }

    private void inputSearchData() {
        int menuSearchItem = dataView.inputSearchItem();
        switch (menuSearchItem) {
            case 0:
                System.exit(0);
            case 1:
                searchBook.viewName(serviceBooks.getBookList(), dataView.inputString("введите название книги"));
                break;
            case 2:
                searchBook.viewAuthor(serviceBooks.getBookList(), dataView.inputString("введите автора книги"));
                break;
            case 3:
                searchBook.viewPublish(serviceBooks.getBookList(), dataView.inputString("введите публикатора книги"));
                break;
            case 4:
                searchBook.viewYear(serviceBooks.getBookList(), Integer.parseInt(dataView.inputString("введите год книги")));
                break;
            default:
                printBooks.printMessage(BooksView.ERROR_ENTER);
        }
    }
}

