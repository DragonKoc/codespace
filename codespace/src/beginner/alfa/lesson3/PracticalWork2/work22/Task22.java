package beginner.alfa.lesson3.PracticalWork2.work22;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task22 {
    public static void main (String [] args){
        long dt = System.currentTimeMillis();//количество миллисекунд до сейчас
        long mlS = 86400000;// миллисекунд в сутках
        long kolday = dt/mlS;//количество дней до сейчас
        long day = kolday-18261;// прошло дней от 00:00:00 1 января 2020 года

        long mlH = 3600000;//миллисекунд в часе
        long kolhours = dt/mlH;//количество часов до сейчас
        double hours = (kolhours-438262)%24;// прошло часов от 00:00:00 1 января 2020 года(%24 сколько часов сейчас)

        long mlM = 60000;//миллисекунд в минуте
        long kolminut = dt/mlM;//количество минут до сейчас
        double minuts = (kolminut-32460)%60;// прошло минут от 00:00:00 1 января 2020 года(%60 сколько минут сейчас)

        long mlSs = 1000;//миллисекунд в секунде
        long kolsek = dt/mlSs;//количество секунд до сейчас
        double seconds = (kolsek-1949820)%60;// прошло секунд от 00:00:00 1 января 2020 года(%60 сколько секунд сейчас)

        System.out.println ("Дата в формате DD:HH:MM:SS-> "+ day+" "+ String.format ("%2.0f", hours)+":"+String.format ("%2.0f",minuts)+":"+String.format ("%2.0f",seconds));


        DateFormat TIMESTAMP = new SimpleDateFormat ("dd HH:mm:ss");
        System.out.println("Дата в формате DD:HH:MM:SS-> "+TIMESTAMP.format(new Date ()));

    }
}
