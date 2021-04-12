package advanced.alfa.lesson7.work1;

public class Runner {
    public void run(){
        //1
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Ivan","+38(066)1234567");
        myPhoneBook.addPhoneNumber("Peter","+38(096)1234567");
        myPhoneBook.addPhoneNumber("Alex","+38(063)1234567");
        myPhoneBook.addPhoneNumber("Helen","+38(067)1234567");
        myPhoneBook.addPhoneNumber("Maria","+38(068)1234567");
        myPhoneBook.addPhoneNumber("Yehor","+38(093)1234567");
        myPhoneBook.addPhoneNumber("Lili","+38(061)1234567");
        myPhoneBook.addPhoneNumber("Koc","+38(099)1234567");
        myPhoneBook.addPhoneNumber("Vasya","+38(050)1234567");
        myPhoneBook.addPhoneNumber("Ktoto","+38(055)1234567");
//        myPhoneBook.printPhoneBook();

        //2
        myPhoneBook.sortByName();
        myPhoneBook.printPhoneBook();
        System.out.println();
        myPhoneBook.sortByPhone();
        myPhoneBook.printPhoneBook();
    }
}
