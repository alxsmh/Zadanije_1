/*
 * CircleSquarerTest
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task3.tests;
import static shamshur.z1.task3.geometry.CircleSquarer.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CircleSquarerTest {
	
	@Test
	public void calculateCircleSquare_R20_expected1256() {
		
		double expected = 1256.0d;
		double actual = calculateCircleSquare(20.0d);
		
		assertEquals((int)expected, (int)actual);
		
	}
	
	@Test
	public void calculateCircleSquare_Rminus6_expected113() {
		
		double expected = 113.0d;
		double actual = calculateCircleSquare(-6.0d);
		
		assertEquals((int)expected, (int)actual);
		
	}
	
	@Test
	public void calculateRingSquare_R1_8_R2_4_expected150() {
		
		double expected = 150.796d;
		double actual = calculateRingSquare(8.0d,4.0d);
		
		assertEquals((int)expected, (int)actual);
		
	}
	
	@Test
	public void calculateRingSquare_R1_3_R2_minus6_expected84() {
		
		double expected = 84.823d;
		double actual = calculateRingSquare(3.0d,-6.0d);
		
		assertEquals((int)expected, (int)actual);
		
	}

}
