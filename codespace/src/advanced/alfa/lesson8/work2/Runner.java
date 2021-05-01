package advanced.alfa.lesson8.work2;

public class Runner {

    public static void run(){

        Person ivan = new Person ( "Ivan", "Ivanov", 100 );
        Person petya = new Person ();
        petya.setFirstName("Petya");
        petya.setLastName("Pyatochkin");

        while(true){
            try{
                petya.setAge(121);
            } catch (InvalidAgeException e ){
                System.out.println(e.getMessage());
                petya.setAge(110);
                break;
            }
        }


        System.out.println ( ivan +"\n");
        System.out.println ( petya +"\n");

    }

}
