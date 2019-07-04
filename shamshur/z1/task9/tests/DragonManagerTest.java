/*
 * DragonManagerTest
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task9.tests;
import static org.testng.Assert.assertEquals;
import org.junit.Test;
import static shamshur.z1.task9.dragon.DragonManager.calculateHeads;
import static shamshur.z1.task9.dragon.DragonManager.calculateEyes;



public class DragonManagerTest {
	
	@Test
	public void calculateHeads_Int1376_expected1879()
	{
		int expected = 1879;
		int actual = calculateHeads(1376);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void calculateHeads_Int276_expected755()
	{
		int expected = 755;
		int actual = calculateHeads(276);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void calculateHeads_Int103_expected312()
	{
		int expected = 312;
		int actual = calculateHeads(103);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void calculateHeads_Int0_expected3()
	{
		int expected = 3;
		int actual = calculateHeads(0);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void calculateHeads_Intminus6_expected0()
	{
		int expected = 0;
		int actual = calculateHeads(-6);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void calculateEyes_Int2099_expected5204()
	{
		int expected = 5204;	//calculateHeads(2099)*2
		int actual = calculateEyes(2099);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void calculateEyes_Int0_expected3()
	{
		int expected = 6;
		int actual = calculateEyes(0);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void calculateEyes_Intminus8_expected0()
	{
		int expected = 0;
		int actual = calculateEyes(-8);
		
		assertEquals(actual, expected);
	}

}
