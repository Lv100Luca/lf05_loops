package numberAnalyser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberAnalyserTest {
    private NumberAnalyser analyser;

    @BeforeEach
    public void setUp(){
        this.analyser = new NumberAnalyser();
    }

//    @Test
//    public void givenTwoNumbers_WhengetGGT_ReturnGGT(){
//        assertEquals(4, this.analyser.getGGT(12, 8));
//        assertEquals(3, this.analyser.getGGT(15, 3));
//        assertEquals(1, this.analyser.getGGT(5, 3));
//    }

    @ParameterizedTest(name = "number={0}")
    @CsvSource(value = {"2", "3", "5", "7", "11", "13", "17", "19","37", "53", "83", "149", "199", "241"})
    public void givenPrimeNumber_WhenIsPrimeNumber_ThenReturnTrue(int number){
        assertTrue(this.analyser.isPrimeNumber(number));
    }

    @Test
    public void givenOne_WhenIsPrimeNumber_ThenReturnFalse(){
        assertFalse(this.analyser.isPrimeNumber(1));
    }

    @ParameterizedTest(name = "number={0}")
    @CsvSource(value = {"4", "8", "9", "10", "12", "40", "15", "16", "21","77", "27", "55", "39", "45", "51"})
    public void givenNonPrimeNumber_WhenIsPrimeNumber_ThenReturnFalse(int number){
        assertFalse(this.analyser.isPrimeNumber(number));
    }

    @Test
    public void givenIntervalFrom1To70_WhenGetPrimeNumbers_ReturnPrimeNumbersString(){
        assertEquals("2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67", this.analyser.getPrimeNumbers(1,70));
    }

    @ParameterizedTest(name = "number={0}, result={1}")
    @CsvSource(value = {"2, 2", "4, 4", "10, 1", "19, 10", "196, 16","7895, 29", "48234, 21"})
    public void givenOneNumber_WhenGetChecksum_ThenReturnQuersumme(int number, int result){
        assertEquals(result, this.analyser.getChecksum(number));
    }

    @ParameterizedTest(name = "number={0}")
    @CsvSource(value = {"1", "7", "10", "13", "19", "31", "44", "68", "70", "79", "82", "208", "326", "404", "608", "833", "923"})
    public void givenHappyNumber_WhenIsHappyNumber_ThenReturnTrue(int number){
        assertTrue(this.analyser.isHappyNumber(number));
    }

    @ParameterizedTest(name = "number={0}")
    @CsvSource(value = {"4", "22", "20", "3627", "240685", "40", "99", "29", "246"})
    public void givenNonHappyNumber_WhenIsHappyNumber_ThenReturnFalse(int number){
        assertFalse(this.analyser.isHappyNumber(number));
    }

    @ParameterizedTest(name = "number={0}")
    @CsvSource(value = {"6", "28", "496", "8128", "33550336"})
    public void givenPerfectNumber_WhenIsPerfectNumber_ThenReturnTrue(int number){
        assertTrue(this.analyser.isPerfectNumber(number));
    }

    @ParameterizedTest(name = "number={0}")
    @CsvSource(value = {"4", "22", "20", "3627", "240685", "40", "99", "29", "246"})
    public void givenNonPerfectNumber_WhenIPerfectNumber_ThenReturnFalse(int number){
        assertFalse(this.analyser.isPerfectNumber(number));
    }


}
