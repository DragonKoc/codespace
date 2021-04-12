package advanced.alfa.lesson6.theory;

public class TestThrows {



   static class Student{
        private int age = 0;

       public Student(int age) {
           this.age = age;
       }

       public void printStudent() throws KocException {
           if (this.age > 100 ){
               throw new KocException("exception!", 2);
           }
               System.out.println(this.age);
       }
    }

    public static void main(String[] args) throws KocException  {
        Student student = new Student(101);
        student.printStudent();

    }
}
