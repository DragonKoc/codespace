package advanced.alfa.lesson3.work1;

public class Runner {
    public static void run(){

        //work 1
        Device device = new Device (  "AA-00001","X86", 100.0);
        System.out.println("task1");
        System.out.println(device+ "\n");

        Device[] devices = {
                new Device("AB-11115", "IBM", 150.0),
                new Adapter("AB1234567CD", "Samsung", 120.0, 100, 1024),
                new Monitor("L2928UT-90", "LG", 3021.0, 1024, 768)
        };

        for (Device elem: devices){
            System.out.println ( elem );
        }

//12. Добавьте в код метода run() вызов на существующем массиве методов equals()и hashCode().
        System.out.println ( "\nвызов equals для devices hashcode" );
        System.out.println ( devices.hashCode() == devices.hashCode());
        System.out.println ( "\nвызов equals для devices" );
        System.out.println ( devices.equals(devices));

    }
}
