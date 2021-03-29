package advanced.alfa.lesson3.theory;
//слайды_block-2_3.pdf

public class Student {
private String name;
private long phone;
private int age;

    public Student(String name, long l, int i) {
        this.age = i;
        this.name = name;
        this.phone = l;
    }

    @Override
    public int hashCode(){
    int result = 17;
    result = 31 * result + name.hashCode();
    result = 31 * result + (int)(phone^(phone>>>32));
    result = 31 * result + age;
    return result;
}

    public static void main(String[] args) {

    Student stud_1 = new Student("Peter", 3534353L, 20);
    Student stud_2 = new Student("Ivan", 554353L, 18);
    Student stud_3 = new Student("Olya", 312353L, 21);
    Student stud_4 = new Student("Ivan", 554353L, 18);

//    stud2 stud_4 идентичны и хеш коды совпадают
        System.out.println(stud_1.hashCode());
        System.out.println(stud_2.hashCode());
        System.out.println(stud_3.hashCode());
        System.out.println(stud_4.hashCode());
}}
