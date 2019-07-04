/*
 * EqualNumbersTest
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task1.tests;
import static shamshur.z1.task1.equalNumbers.EqualNumbers.isEqualNumbers;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EqualNumbersTest {

	@Test
	public void IsEqualNumbers_eqByteByte_expectedTRUE() {
		
		boolean expected = true;
		boolean actual = isEqualNumbers((byte)6,(byte)6);
		
		assertEquals(expected, actual);
		
	}

	@Test
	public void IsEqualNumbers_eqShortShort_expectedTRUE() {
		
		assertEquals(isEqualNumbers((short)6,(short)6), true);
		
	}

	@Test
	public void IsEqualNumbers_eqIntInt_expectedTRUE() {
		
		assertEquals(isEqualNumbers(6,6), true);
		
	}

	@Test
	public void IsEqualNumbers_eqLongLong_expectedTRUE() {
		
		assertEquals(isEqualNumbers(6L,6L), true);
		
	}

	@Test
	public void IsEqualNumbers_eqFloatFloat_expectedTRUE() {
		
		assertEquals(isEqualNumbers(6.0f,6.0f), true);
		
	}

	@Test
	public void IsEqualNumbers_eqDoubleDouble_expectedTRUE() {
		
		assertEquals(isEqualNumbers(6.0d,6.0d), true);

	}
	
	@Test
	public void IsEqualNumbers_eqIntInt_expectedFALSE() {
		
		assertEquals(isEqualNumbers(6,8), false);
		
	}
	
	@Test
	public void IsEqualNumbers_uneqIntLowerZeroInt_expectedFALSE() {
		
		assertEquals(isEqualNumbers(6,-6), false);
		
	}

}
