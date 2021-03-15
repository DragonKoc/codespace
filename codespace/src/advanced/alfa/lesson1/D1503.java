package advanced.alfa.lesson1;

import advanced.alfa.lesson1.work1.Book;
import advanced.alfa.lesson1.worker.CRUD;
import java.util.Scanner;


public class D1503 {

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

        //increase cost
        crud.increaseCost(books, newCost);

    }
}
