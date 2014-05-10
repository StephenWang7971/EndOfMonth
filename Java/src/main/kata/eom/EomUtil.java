package kata.eom;

import java.util.Calendar;
import java.util.Date;

public class EomUtil {
	
	public static Date getEndDateOfMonth(Date given) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(given);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);

        calendar.set(Calendar.DATE, 31);   //This causes error in other montht.

		return calendar.getTime();
	}
}