package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderEx {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d-M-YYYY mm-hh-ss");
        System.out.println(simpleDateFormat.format(calender.getTime()));
        System.out.println(calender.get(Calendar.DAY_OF_MONTH));
        System.out.println(calender.get(Calendar.HOUR));
        System.out.println(calender.get(Calendar.WEEK_OF_MONTH));
    }
}
