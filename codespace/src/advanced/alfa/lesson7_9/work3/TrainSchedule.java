package advanced.alfa.lesson7_9.work3;

public class TrainSchedule {

    private Train[] trains;

    private int cnt = 0;

    public TrainSchedule(int cnttrains) {
        this.trains = new Train[cnttrains];
    }

    public Train[] getTrains() {
        return trains;
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }

    public Train addTrain(int number,
                          String stationDispatch,
                          String stationArrival,
                          String timeDispatch,
                          String timeArrival,
                          DaysofWeek days) {

        Train trainone = new Train(number);

        trainone.setStationDispatch(stationDispatch);
        trainone.setStationArrival(stationArrival);
        trainone.setTimeDispatch(timeDispatch);
        trainone.setTimeArrival(timeArrival);
        trainone.setDays(days);
        return trainone;
    }

    public void printTrains(Train[] arraytrains){
        for (Train tra: arraytrains) {
            System.out.println(tra.toString());
        }
    }

    public void searchTrains(String stationArrival, DaysofWeek day, Train[] arraytrains){
        for (int i = 0; i <arraytrains.length; i++) {

            if (arraytrains[i].getStationArrival().equals(stationArrival) && arraytrains[i].getDays().equals(day)) {
                System.out.println ("Yeap! this train is\n" + arraytrains[i]);
            }
        }
    }


}
