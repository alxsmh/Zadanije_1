/*
 * DaterTest
 * 
 * Version: 1.0
 * 
 * 04.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task11.tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import static shamshur.z1.task11.calendar.Dater.isLeap;
import static shamshur.z1.task11.calendar.Dater.isValidDay;
import static shamshur.z1.task11.calendar.Dater.calculateNextDate;

public class DaterTest {
	
	@Test
	public void isLeap_Int1604_ExpectedTRUE()
	{
		boolean expected = true;
		boolean actual = isLeap(1604);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isLeap_Int2000_ExpectedTRUE()
	{
		boolean expected = true;
		boolean actual = isLeap(1600);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isLeap_Int1800_ExpectedFALSE()
	{
		boolean expected = false;
		boolean actual = isLeap(1800);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isLeap_Int2005_ExpectedFALSE()
	{
		boolean expected = false;
		boolean actual = isLeap(2005);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isValidDay_Int29_02_2005_ExpectedFALSE()
	{
		boolean expected = false;
		boolean actual = isValidDay(29, 02, 2005);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isValidDay_Int04_02_2005_ExpectedTRUE()
	{
		boolean expected = true;
		boolean actual = isValidDay(04, 02, 2005);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isValidDay_Int36_07_2016_ExpectedFALSE()
	{
		boolean expected = false;
		boolean actual = isValidDay(36, 07, 2016);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isValidDay_Int29_02_2016_ExpectedTRUE()
	{
		boolean expected = true;
		boolean actual = isValidDay(29, 02, 2016);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isValidDay_Int_minus2_10_1992_ExpectedFALSE()
	{
		boolean expected = false;
		boolean actual = isValidDay(-2, 10, 1992);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isValidDay_Int10_15_2005_ExpectedFALSE()
	{
		boolean expected = false;
		boolean actual = isValidDay(10, 15, 2005);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void isValidDay_Int12_04_minus230_ExpectedFALSE()
	{
		boolean expected = false;
		boolean actual = isValidDay(12, 04, -230);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void calculateNextDate_Int_26_05_2009_expected_27_05_2009()
	{
		String expected = "27.05.2009";
		String actual = calculateNextDate(26, 05, 2009);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void calculateNextDate_Int_28_02_2016_expected_29_02_2016()
	{
		String expected = "29.02.2016";
		String actual = calculateNextDate(28, 02, 2016);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void calculateNextDate_Int_28_02_2015_expected_01_03_2015()
	{
		String expected = "01.03.2015";
		String actual = calculateNextDate(28, 02, 2015);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void calculateNextDate_Int_31_12_1985_expected_01_01_1986()
	{
		String expected = "01.01.1986";
		String actual = calculateNextDate(31, 12, 1985);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void calculateNextDate_Int_35_02_2015_expected_ERROR()
	{
		String expected = "ERROR";
		String actual = calculateNextDate(35, 02, 2015);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void calculateNextDate_Int_10_90_2015_expected_ERROR()
	{
		String expected = "ERROR";
		String actual = calculateNextDate(10, 90, 2015);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void calculateNextDate_Int_21_03_minus400_expected_ERROR()
	{
		String expected = "ERROR";
		String actual = calculateNextDate(21, 03, -400);
		
		assertEquals(expected, actual);
	}

}
