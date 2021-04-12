package advanced.alfa.lesson6.work2;

public class Person {

    String firstName;
    String lastName;
    int age;

    public String getFirstName () {
        return firstName;
    }
    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }
    public String getLastName () {
        return lastName;
    }
    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }
    public int getAge () {
        return age;
    }
    public void setAge  ( int age ) throws InvalidAgeException {
        if ( age < 1 || age > 120) { throw new InvalidAgeException(); }
        this.age = age;
    }

    public Person () { }

    public Person ( String firstName, String lastName, int age ) {
        this.firstName = firstName;
        this.lastName = lastName;

        if ( age < 1 || age > 120) { throw new InvalidAgeException(); }
        this.age = age;
    }

    @Override
    public String toString () {
        return "FirstName: " + firstName +
                "\nLastName: " + lastName +
                "\nAge: " + age ;
    }



}
