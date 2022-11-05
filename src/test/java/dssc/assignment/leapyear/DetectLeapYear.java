package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetectLeapYear {
    @ParameterizedTest
    @ValueSource(ints = {2001, 2022, 1997})
    void detectNotLeapYear(int year) {
        LeapYear leapYear = new LeapYear();
        boolean res = leapYear.isLeapYear(year);
        assertFalse(res);
    }

    @ParameterizedTest
    @ValueSource(ints = {1996, 1992, 2008})
    void multipleOf4(int year) {
        LeapYear leapYear = new LeapYear();
        boolean res = leapYear.isLeapYear(year);
        assertTrue(res);
    }

    @ParameterizedTest
    @ValueSource(ints = {1900, 1500, 1100})
    void multipleOf4ButNotOf100(int year) {
        LeapYear leapYear = new LeapYear();
        boolean res = leapYear.isLeapYear(year);
        assertFalse(res);
    }

    @ParameterizedTest
    @ValueSource(ints = {2000,1600,1200})
    void multipleOf4NotOf100ButOf400(int year) {
        LeapYear leapYear = new LeapYear();
        boolean res = leapYear.isLeapYear(year);
        assertTrue(res);
    }
}
