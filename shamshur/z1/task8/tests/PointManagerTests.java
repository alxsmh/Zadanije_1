/*
 * PointManagerTests
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task8.tests;
import static org.testng.Assert.assertEquals;
import org.junit.Test;
import static shamshur.z1.task8.triangle.PointManager.isRectangularTriangle;
import static shamshur.z1.task8.triangle.PointManager.isTriangle;

public class PointManagerTests {
	
	@Test
	public void isTriangle_Int2_6_5_5_10_1_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = isTriangle(2,6,5,5,10,1);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void isTriangle_Int2_6_2_5_2_1_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = isTriangle(2,6,2,5,2,1);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void isTriangle_Int0_minus6_5_0_2_1_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = isTriangle(0,-6,5,0,2,1);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void isTriangle_Int_AllZero_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = isTriangle(0,0,0,0,0,0);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void isRectangularTriangle_Int2_6_5_5_10_1_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = isRectangularTriangle(2,6,5,5,10,1);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void isRectangularTriangle_Int0_2_0_8_7_2_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = isRectangularTriangle(0,2,0,8,7,2);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void isRectangularTriangle_Int0_0_5_minus6_0_minus6_expectedTRUE()
	{
		boolean expected = true;
		boolean actual = isRectangularTriangle(0,0,5,-6,0,-6);
		
		assertEquals(actual, expected);
	}
	
	//will fail, because before isRectangularTriangle we have to check if its even rectangle
	//watch shamshur.z1.task8.triangle.PointManager.checkTrianle - function
	@Test
	public void isRectangularTriangle_Int_AllZero_expectedFALSE()
	{
		boolean expected = false;
		boolean actual = isRectangularTriangle(0,0,0,0,0,0);
		
		assertEquals(actual, expected);
	}
	

}
