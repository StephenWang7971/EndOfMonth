package kata.eom;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


public class EomUtil {


    public static Date getEndDateOfMonth(Date given) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(given);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);

        int eom = 31;

        if (month == 1) {
            if (isLeapYear(year)) {
                eom = 29;
            } else {
                eom = 28;
            }
        } else if (isBigMonth(month)) {
            eom = 31;
        } else if (isSmallMonth(month)) {
            eom = 30;
        }

        calendar.set(Calendar.DATE, eom);

        return calendar.getTime();
    }

    private static boolean isSmallMonth(int month) {
        int[] months = {3, 5, 8, 10};
        return Arrays.stream(months).anyMatch(e -> e == month);
    }

    private static boolean isBigMonth(int month) {
        int[] months = {0, 2, 4, 6, 7, 9, 11};
        return Arrays.stream(months).anyMatch(e -> e == month);
    }

    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0)||(year%400==0));
    }


}