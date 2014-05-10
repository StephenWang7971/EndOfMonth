package kata.eom;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class TestEomUtil {

    @Test
    public void test135781012() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2013);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DATE, 12);
        Date eom = EomUtil.getEndDateOfMonth(calendar.getTime());
        Calendar target = Calendar.getInstance();
        target.setTime(eom);
        assertEquals("year is different", 2013, target.get(Calendar.YEAR));
        assertEquals("month is different", 0, target.get(Calendar.MONTH));
        assertEquals("date is different", 31, target.get(Calendar.DATE));
    }

    @Test
    public void test46911() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2013);
        calendar.set(Calendar.MONTH, 3);
        calendar.set(Calendar.DATE, 15);
        Date eom = EomUtil.getEndDateOfMonth(calendar.getTime());
        Calendar target = Calendar.getInstance();
        target.setTime(eom);
        assertEquals("year is different", 2013, target.get(Calendar.YEAR));
        assertEquals("month is different", 3, target.get(Calendar.MONTH));
        assertEquals("date is different", 30, target.get(Calendar.DATE));
    }

    @Test
    public void test2() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2013);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DATE, 15);
        Date eom = EomUtil.getEndDateOfMonth(calendar.getTime());
        Calendar target = Calendar.getInstance();
        target.setTime(eom);
        assertEquals("year is different", 2013, target.get(Calendar.YEAR));
        assertEquals("month is different", 1, target.get(Calendar.MONTH));
        assertEquals("date is different", 28, target.get(Calendar.DATE));
    }

    @Test
    public void testLeap2() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2012);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DATE, 15);
        Date eom = EomUtil.getEndDateOfMonth(calendar.getTime());
        Calendar target = Calendar.getInstance();
        target.setTime(eom);
        assertEquals("year is different", 2012, target.get(Calendar.YEAR));
        assertEquals("month is different", 1, target.get(Calendar.MONTH));
        assertEquals("date is different", 29, target.get(Calendar.DATE));
    }

}
