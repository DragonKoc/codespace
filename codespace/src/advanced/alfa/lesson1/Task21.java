package advanced.alfa.lesson1;

import advanced.alfa.lesson1.work1.Book;
import advanced.alfa.lesson1.worker.CRUD;
import java.util.Scanner;

//Практическая работа 2-1.pdf


public class Task21 {

    public static void main(String[] args) {
    //    Runner runner = new Runner();
    //    runner.run();

        CRUD crud = new CRUD();

        //scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many books you want?");
        int countBooks = scanner.nextInt();
        System.out.println("Please input new price:");
        int newCost = scanner.nextInt();

        //create book
        Book[] books = crud.createArrayBook(countBooks);

        //практическая работа 1-4
        //increase cost
        crud.increaseCost(books, newCost);

        //практическая работа 1-5
        //find author
        crud.viewAuthor(books,"Author1");

        //find publish
        crud.viewPublish(books,"Publish2");

        //find by year and after
        crud.viewYear(books,2002);

    }
}
