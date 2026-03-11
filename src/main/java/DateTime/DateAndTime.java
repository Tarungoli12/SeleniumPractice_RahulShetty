package DateTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
        System.out.println(simpleDateFormat1.format(date));
        System.out.println(simpleDateFormat2.format(date));
        System.out.println(date);

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
    }
}
