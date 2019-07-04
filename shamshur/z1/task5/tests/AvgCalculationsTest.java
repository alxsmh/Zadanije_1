/*
 * AvgCalculationsTest
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task5.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static shamshur.z1.task5.math.AvgCalculations.calculateArythmeticAVG;
import static shamshur.z1.task5.math.AvgCalculations.calculateGeometricAVG;;

public class AvgCalculationsTest {
	
	@Test
	public  void calculateArythmeticAVG_Int2468_expected5()
	{
		double expected = 5.0d;
		double actual = calculateArythmeticAVG(2468);
		assertEquals(expected, actual,0);
	}
	
	@Test
	public  void calculateArythmeticAVG_Int_minus2468_expected5()
	{
		double expected = 5.0d;
		double actual = calculateArythmeticAVG(-2468);
		assertEquals(expected, actual,0);
	}
	
	@Test
	public  void calculateArythmeticAVG_IntZero_expected0()
	{
		double expected = 0.0d;
		double actual = calculateArythmeticAVG(0);
		assertEquals(expected, actual,0);
	}
	
	@Test
	public  void calculateGeometricAVG_Int2468_expected4_43()
	{
		double expected = 4.43d;
		double actual = calculateGeometricAVG(2468);
		assertEquals(expected, actual,2);
	}
	
	@Test
	public  void calculateGeometricAVG_Int_minus2468_expected4_43()
	{
		double expected = 4.43d;
		double actual = calculateGeometricAVG(-2468);
		assertEquals(expected, actual,2);
	}
	
	@Test
	public  void calculateGeometricAVG_IntZero_expected1()
	{
		double expected = 1.0d;
		double actual = calculateGeometricAVG(0);
		assertEquals(expected, actual,0);
	}

}
