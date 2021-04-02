package advanced.alfa.lesson5.work1;

public enum DaysOfWeek {
    SUNDAY,MONDAY,TUESDAY, WEDNESDAY, THURSDAY,FRIDAY,SATURDAY;

    public DaysOfWeek nextDay(){
       // return DaysOfWeek.values()[this.ordinal() + 1];
       return this == SATURDAY ? DaysOfWeek.SUNDAY : DaysOfWeek.values()[this.ordinal() + 1];
    }

}
