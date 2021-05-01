package advanced.alfa.lesson7_9.work3;

public class Train {
    int number;
    String stationDispatch;
    String stationArrival;
    String timeDispatch;
    String timeArrival;
    DaysofWeek days;

    public Train(int number) {
        this.number = number;
    }

    public Train(int number, String stationDispatch, String stationArrival, String timeDispatch, String timeArrival, DaysofWeek days) {
        this.number = number;
        this.stationDispatch = stationDispatch;
        this.stationArrival = stationArrival;
        this.timeDispatch = timeDispatch;
        this.timeArrival = timeArrival;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", stationDispatch='" + stationDispatch + '\'' +
                ", stationArrival='" + stationArrival + '\'' +
                ", timeDispatch='" + timeDispatch + '\'' +
                ", timeArrival='" + timeArrival + '\'' +
                ", days=" + days +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStationDispatch() {
        return stationDispatch;
    }

    public void setStationDispatch(String stationDispatch) {
        this.stationDispatch = stationDispatch;
    }

    public String getStationArrival() {
        return stationArrival;
    }

    public void setStationArrival(String stationArrival) {
        this.stationArrival = stationArrival;
    }

    public String getTimeDispatch() {
        return timeDispatch;
    }

    public void setTimeDispatch(String timeDispatch) {
        this.timeDispatch = timeDispatch;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public DaysofWeek getDays() {
        return days;
    }

    public void setDays(DaysofWeek days) {
        this.days = days;
    }
}
