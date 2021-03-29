package advanced.alfa.lesson2.work2;

public class Runner {

    public static void run() {

        Employee employee1 = new Employee("Петя", "Гаврилов", "Зануда", 6598);
        employee1.viewEmployee();

        Employee employee2 = new Employee("Вася", "Грьльев", "Главный по ничего не делать", 2332);
        employee2.viewEmployee();

        Employee employee3 = new Employee("Варвара", "Косичкина", "Дочь БОССА", 1111);
        employee3.viewEmployee();

        Employee employee = new Employee();
        employee.viewEmployee();

        Employee employee4 = new Employee("Паша", "Топский");
        employee4.viewEmployee();

    }
}
