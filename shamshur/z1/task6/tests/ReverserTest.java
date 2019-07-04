/*
 * ReverserTest
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task6.tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static shamshur.z1.task6.reverser.Reverser.reverseInt;

public class ReverserTest {
	
	@Test
	public void reverseInt_Int678431_expected134876()
	{
		int expected = 134876;
		int actual = reverseInt(678431);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void reverseInt_IntZero_expected0()
	{
		int expected = 0;
		int actual = reverseInt(0);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void reverseInt_Int_minus672_expected_minus276()
	{
		int expected = -276;
		int actual = reverseInt(-672);
		
		assertEquals(expected, actual);
	}

}
