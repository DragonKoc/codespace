package advanced.alfa.lesson5.work1;

import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public void run(){
        //1
        for(DaysOfWeek day: DaysOfWeek.values()){
            System.out.println(day + " " + day.name() + " " + day.ordinal());
        }
        //2
        for(DaysOfWeek day: DaysOfWeek.values()){
           switch (day){
               case FRIDAY: case MONDAY: case WEDNESDAY:
                   System.out.println(day);
           }
        }

        for(DaysOfWeek day: DaysOfWeek.values()){
            if (day.ordinal() %2 != 0){
                System.out.println(day);
            }
        }

        //3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of week: ");
        String day = sc.next();
        System.out.println("Next day -> " + DaysOfWeek.valueOf(day.toUpperCase()).nextDay());

    }
}
