/*
 * Convertator
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package shamshur.z1.task2.metric;

import java.math.BigDecimal;

public class Convertator {
	
	static BigDecimal si = new BigDecimal ("1000");
	
	//calculates weight value on category down
	//example tons -> kilograms or kilotons -> tons
	public static BigDecimal calculateUp (BigDecimal value)
	{
		return value.divide(si);
	}
	
	//calculates weight value on category up
	//example tons -> kilotons or grams -> kilograms
	public static BigDecimal calculateDown(BigDecimal value)
	{
		return value.multiply(si);
	}

}
