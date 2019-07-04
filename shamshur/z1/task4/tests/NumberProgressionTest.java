
/*
 * NumberProgressionTest
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task4.tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static shamshur.z1.task4.Progressions.NumberProgression.isProgressioned;

public class NumberProgressionTest {

	@Test
	public void isProgressioned_String1369_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = isProgressioned("1369");
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void isProgressioned_String95321_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = isProgressioned("95321");
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void isProgressioned_String136321_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = isProgressioned("136321");
		
		assertEquals(expected, actual);
		
	}
}
