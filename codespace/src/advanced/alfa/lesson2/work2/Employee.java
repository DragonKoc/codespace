package advanced.alfa.lesson2.work2;

public class Employee {

    private String firstName;
    private String lastName;
    private String occupation;
    private int telephone;
    static private int numberOfEmployees;

    {
        numberOfEmployees++;
    }

    public Employee(String firstName, String lastName, String occupation, int telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
    }

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, "Аналитик", 5986);
    }

    public Employee() {
        this("Петр", "Петров", "Сисадмин", 7595);
    }


    public void viewEmployee() {
        System.out.println("ID: " + numberOfEmployees);
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Должность: " + occupation);
        System.out.println("Номер телефона:" + telephone);

    }
}
