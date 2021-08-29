/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Heet
 */
public class StringcalculatorTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, Stringcalculator.add(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(1, Stringcalculator.add("1"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(3, Stringcalculator.add("1,2"));
    }

    @Test
    public void testNewLines() {
        assertEquals(6, Stringcalculator.add("1\n2,3"));
    }
    
    @Test
    public void testCustomDelimiter(){
    	assertEquals(3, Stringcalculator.add("//;\n1;2"));
    }
}
