package kata.eom;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class TestEomUtil8 {

    @Test
    public void test135781012() {

        LocalDate date = LocalDate.parse("2013-01-12", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        LocalDate eom = EomUtil8.getEndDateOfMonth(date);

        assertEquals("year is different", 2013, eom.getYear());
        assertEquals("month is different", 1, eom.getMonthValue());
        assertEquals("date is different", 31, eom.getDayOfMonth());
    }

    @Test
    public void test46911() {

        LocalDate date = LocalDate.parse("2013-04-15", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        LocalDate eom = EomUtil8.getEndDateOfMonth(date);

        assertEquals("year is different", 2013, eom.getYear());
        assertEquals("month is different", 4, eom.getMonthValue());
        assertEquals("date is different", 30, eom.getDayOfMonth());
    }

    @Test
    public void test2() {
        LocalDate date = LocalDate.parse("2013-02-15", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        LocalDate eom = EomUtil8.getEndDateOfMonth(date);

        assertEquals("year is different", 2013, eom.getYear());
        assertEquals("month is different", 2, eom.getMonthValue());
        assertEquals("date is different", 28, eom.getDayOfMonth());
    }

    @Test
    public void testLeap2() {
        LocalDate date = LocalDate.parse("2012-02-15", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        LocalDate eom = EomUtil8.getEndDateOfMonth(date);

        assertEquals("year is different", 2012, eom.getYear());
        assertEquals("month is different", 2, eom.getMonthValue());
        assertEquals("date is different", 29, eom.getDayOfMonth());
    }


    @Test
    public void testNonLeap2() {

        LocalDate date = LocalDate.parse("2000-02-15", DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        LocalDate eom = EomUtil8.getEndDateOfMonth(date);

        assertEquals("year is different", 2000, eom.getYear());
        assertEquals("month is different", 2, eom.getMonthValue());
        assertEquals("date is different", 29, eom.getDayOfMonth());
    }
}
