/*
 * Metrical
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package shamshur.z1.task2.metric;
import static shamshur.z1.task2.metric.Convertator.calculateUp;
import static shamshur.z1.task2.metric.Convertator.calculateDown;
import java.math.BigDecimal;

//convert kilograms into tons,grams,kilograms into BigDecimal type
public class Metrical {
	
	//tons -> kilograms
	public static BigDecimal calculateKilogramsFromTons(BigDecimal valueTons)
	{
		return calculateDown(valueTons);
	}
	
	// kilograms -> tons
	public static BigDecimal calculateTonsFromKilograms(BigDecimal valueKilograms)
	{
		return calculateUp(valueKilograms);
	}
	
	// kilograms -> grams
	public static BigDecimal calculateGramsFromKilograms(BigDecimal valueKilograms)
	{
		return calculateDown(valueKilograms);
	}
	
	// kilograms -> miligrams
	public static BigDecimal calculateMiliGramsFromKilograms(BigDecimal valueKilograms)
	{
		return calculateDown(calculateDown(valueKilograms));
	}
}
