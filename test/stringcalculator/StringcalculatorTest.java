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
}
