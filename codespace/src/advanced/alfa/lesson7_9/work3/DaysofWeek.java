package advanced.alfa.lesson7_9.work3;

import java.util.Random;

public enum DaysofWeek {
    SUNDAY,MONDAY,TUESDAY, WEDNESDAY, THURSDAY,FRIDAY,SATURDAY;

    public DaysofWeek nextDay(){
        return this == SATURDAY ? DaysofWeek.SUNDAY : DaysofWeek.values()[this.ordinal() + 1];
    }

    public static DaysofWeek randomDay(){
        int day = new Random().nextInt(DaysofWeek.values().length);
        return DaysofWeek.values()[day];
    }


}
