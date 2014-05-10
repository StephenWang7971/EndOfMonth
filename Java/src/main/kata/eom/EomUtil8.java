package kata.eom;

import java.time.LocalDate;
import java.util.Arrays;

public class EomUtil8 {

    public static LocalDate getEndDateOfMonth(LocalDate date) {
        int [] ends = {31,30,29,28};
        for (int e : ends) {
            try {
                LocalDate eom = date.withDayOfMonth(e);
                return eom;
            } catch (Exception ex) {
                //JUST FORGET THIS.
            }
        }
        return null;
    }
}
