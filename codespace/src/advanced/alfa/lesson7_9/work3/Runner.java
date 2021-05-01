package advanced.alfa.lesson7_9.work3;

public class Runner {
    public void run(){
        TrainSchedule trainSchedule = new TrainSchedule(7);

        Train[] alltrain =  trainSchedule.getTrains();

        for (int i = 0; i<= trainSchedule.getTrains().length - 1; i++) {
            String day = "MONDAY";
//            чтобы создать массив в цикле или проще было бы использовать Scanner
//            alltrain[i] = trainSchedule.addTrain(1,"Kiev" + i,"Lvov" + i,"15:0" + i , "21:0" + i, DaysofWeek.valueOf(day.toUpperCase()).nextDay());

            //создание массива с использованием рандомного дня
            alltrain = new Train[]{
                    new Train(1,"Kiev","Lvov","15:00" , "21:00", DaysofWeek.randomDay()),
                    new Train(2,"Kiev","Minsk","13:00" , "23:00", DaysofWeek.randomDay()),
                    new Train(3,"London","Lvov","17:00" , "18:0", DaysofWeek.randomDay()),
                    new Train(4,"Minsk","Kiev","20:00" , "22:00", DaysofWeek.randomDay()),
                    new Train(5,"Kiev","London","21:00" , "22:00", DaysofWeek.randomDay()),
                    new Train(6,"Minsk","London","23:00" , "06:00", DaysofWeek.randomDay()),
                    new Train(7,"London","Kiev","07:00" , "21:00", DaysofWeek.randomDay())
            };
        }

        //метод printTrains(), который отображает в консоль все существующие поезда.
        trainSchedule.printTrains(alltrain);

        //метод searchTrains(...),  который отображает в консоль поезда, идущие до заданной станции  прибытияи в заданный день недели.
        trainSchedule.searchTrains( "London", DaysofWeek.FRIDAY, alltrain);

    }
}
