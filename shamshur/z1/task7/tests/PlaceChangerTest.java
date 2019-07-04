/*
 * PlaceChangerTest
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task7.tests;
import static org.testng.Assert.assertEquals;
import org.junit.Test;
import static shamshur.z1.task7.placer.PlaceChanger.changeIntBetween;

public class PlaceChangerTest {
	
	@Test
	public void changeIntBetween_Int125_Int_402_expected402_125()
	{
		String expected = "402,125";
		String actual = changeIntBetween(125,402);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void changeIntBetween_Int_minus632_Int_24_expected24_minus632()
	{
		String expected = "24,-632";
		String actual = changeIntBetween(-632,24);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void changeIntBetween_Int_minus632_Int_Zero_expectedZero_minus632()
	{
		String expected = "0,-632";
		String actual = changeIntBetween(-632,0);
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void changeIntBetween_Int_Zero_Int_5_expected5_Zero()
	{
		String expected = "5,0";
		String actual = changeIntBetween(0,5);
		
		assertEquals(expected, actual);
	}


}
