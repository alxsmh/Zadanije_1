/*
 * ConvertatorTestTest
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package shamshur.z1.task2.tests;

import static shamshur.z1.task2.metric.Convertator.*;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConvertatorTest {

	@Test
	public void calculateDown_BidDec9999999999_expected9999999999000() {
		
		BigDecimal expected = new BigDecimal("9999999999000");
		BigDecimal tmp = new BigDecimal("9999999999");
		BigDecimal actual = calculateDown(tmp);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void calculateUp_BidDec9999999999_expected9999999_999() {
		
		BigDecimal expected = new BigDecimal("9999999.999");
		BigDecimal tmp = new BigDecimal("9999999999");
		BigDecimal actual = calculateUp(tmp);
		
		assertEquals(expected, actual);
		
	}
}
