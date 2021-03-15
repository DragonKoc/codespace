package advanced.alfa.lesson1;
import advanced.alfa.lesson1.work1.Book;

public class Runner {

    public void run (){
        //2-1 and 2-2
       Book book = new Book();

//        System.out.println("ID=" + book.getAuthor()
//                + "\nName=" + book.getName()
//                + "\nCost=" + book.getCost()
//                + "\nPublish=" + book.getPublish()
//                + "\nYear=" + book.getYear()
//                + "\nPages=" + book.getCountPages()
//        );

        book.viewBook();

        book.setId(1);
        book.setAuthor("Koc");
        book.setCost(55.9);
        book.setPublish("Rainbow");
        book.setYear(1995);
        book.setCountPages(305);

        book.viewBook();

//        System.out.println("ID=" + book.getAuthor()
//        + "\nName=" + book.getName()
//        + "\nCost=" + book.getCost()
//        + "\nPublish=" + book.getPublish()
//        + "\nYear=" + book.getYear()
//        + "\nPages=" + book.getCountPages()
//        );

//2-3
        Book bookfull = new Book(2, "Kobzar", "Pechenyuha","FFFF",200,500,596.6);
        bookfull.viewBook();

        Book book3 = new Book(3, "Kitcya", "Ololo");
        book3.viewBook();

        Book[] books = createArrayBook();

    }

    public Book[] createArrayBook (){
        return new Book[]{
        new Book(5,"name1","Author1","p1",2001,101,1001),
        new Book(6,"name1","Author1","p1",2001,101,1001),
        new Book(7,"name1","Author1","p1",2001,101,1001),
        new Book(8,"name1","Author1","p1",2001,101,1001),
        new Book(9,"name1","Author1","p1",2001,101,1001),
        };
    }
}
