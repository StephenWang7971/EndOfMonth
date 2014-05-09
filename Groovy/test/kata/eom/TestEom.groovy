package kata.eom

import org.testng.annotations.Test;


class EomTest {

    @Test
    void test_normal_30() {
        Calendar c = Calendar.getInstance()
        c.set(Calendar.YEAR, 2014)
        c.set(Calendar.MONTH, 3)
        c.set(Calendar.DATE, 4)
        Date end = EomUtil.getEndOfMonth(c.getTime())
        //assertThat end.getYear(), isEqualTo(2014)
        //assertThat end.getMonth(), isEqualTo(3)
        //assertThat end.getDate(), isEqualTo(30)
    }

    @Test
    void test_normal_31() {
        Calendar c = Calendar.getInstance()
        c.set(Calendar.YEAR, 2014)
        c.set(Calendar.MONTH, 4)
        c.set(Calendar.DATE, 4)
        Date end = EomUtil.getEndOfMonth(c.getTime())
        //assertThat end.getYear(), is(equalTo(2014))
        //assertThat end.getMonth(), is(equalTo(4))
        //assertThat end.getDate(), is(equalTo(31))
    }

    @Test
    void test_normal_feb() {
        Calendar c = Calendar.getInstance()
        c.set(Calendar.YEAR, 2011)
        c.set(Calendar.MONTH, 1)
        c.set(Calendar.DATE, 4)
        Date end = EomUtil.getEndOfMonth(c.getTime())
        //assertThat end.getYear(), is(equalTo(2011))
       // assertThat end.getMonth(), is(equalTo(1))
        //assertThat end.getDate(), is(equalTo(28))
    }

    @Test
    void test_normal_leap_feb() {
        Calendar c = Calendar.getInstance()
        c.set(Calendar.YEAR, 2012)
        c.set(Calendar.MONTH, 1)
        c.set(Calendar.DATE, 5)
        Date end = EomUtil.getEndOfMonth(c.getTime())
        //assertThat end.getYear(), is(equalTo(2012))
        //assertThat end.getMonth(), is(equalTo(1))
        //assertThat end.getDate(), is(equalTo(29))
    }
}
