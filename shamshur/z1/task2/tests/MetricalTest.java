/*
 * MetricalTestTest
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task2.tests;
import static shamshur.z1.task2.metric.Metrical.*;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MetricalTest {
	
	@Test
	public void calculateKilogramsFromTons_780tons_expected780000() {
		
		BigDecimal expected = new BigDecimal("780000");
		BigDecimal tmp = new BigDecimal("780");
		BigDecimal actual = calculateKilogramsFromTons(tmp);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void calculateTonsFromKilograms_500kilograms_expected0_500() {
		
		BigDecimal expected = new BigDecimal("0.500");
		BigDecimal tmp = new BigDecimal("500");
		BigDecimal actual = calculateTonsFromKilograms(tmp);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void calculateGramsFromKilograms_4270kilograms_expected4270000() {
		
		BigDecimal expected = new BigDecimal("4270000");
		BigDecimal tmp = new BigDecimal("4270");
		BigDecimal actual = calculateGramsFromKilograms(tmp);
		
		assertEquals(actual, expected);
		
	}
	
	@Test
	public void calculateMiliGramsFromKilograms_4270kilograms_expected4270000000() {
		
		BigDecimal expected = new BigDecimal("4270000000");
		BigDecimal tmp = new BigDecimal("4270");
		BigDecimal actual = calculateMiliGramsFromKilograms(tmp);
		
		assertEquals(actual, expected);
		
	}

}
