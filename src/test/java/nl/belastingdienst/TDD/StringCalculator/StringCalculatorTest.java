package nl.belastingdienst.TDD.StringCalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    private StringCalculator target;

    @Before
    public void setUp() throws Exception {
        target = new StringCalculator();
    }

    @Test
    public void whenNumbersIsEmptyReturnZero(){
        assertEquals(0, target.add(""));
    }

    @Test
    public void whenOneNumbersIsPresentReturnNumber(){
        assertEquals(5, target.add("5"));
    }

    @Test
    public void whenTwoNumbersArePresentReturnSum(){
        assertEquals(56, target.add("56"));
    }

    @Test
    public void whenMoreNumbersArePresentWithCommasThenReturnSum(){
        assertEquals(11, target.add("5,6"));
    }

    @Test
    public void whenMoreNumbersArePresentWithLinesThenReturnSum(){
        assertEquals(11, target.add("5\n6"));
    }

    @Test
    public void whenMoreNumbersArePresentWithNumbersLargerThenNineThenReturnSum(){
        assertEquals(702, target.add("15\n687"));
    }
    @Test
    public void whenLastCharacterIsNotANumber() {
        assertThrows(IllegalArgumentException.class, () -> target.add("1/n"));
    }

    @Test
    public void whenANumberIsNegativeThrowException() {
        assertThrows(IllegalArgumentException.class, () -> target.add("1,-2"));
    }
    @Test
    public void whenANumberIsLargerThen1000IgnoreNumber() {
        assertEquals(1, target.add("1,1001"));
    }

    @Test
    public void whenDoubleCommaReturnSum() {
        assertEquals(3, target.add("1,,2"));
    }
    @Test
    public void whenLotsOfDelimitersReturnSum() {
        assertEquals(3, target.add("1,$&%^#&,2"));
    }



}