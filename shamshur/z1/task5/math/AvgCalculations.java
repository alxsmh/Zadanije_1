/*
 * AvgCalculations
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task5.math;
import static shamshur.z1.inputRevisor.InputRevisor.*;

public class AvgCalculations {
	
	//calculate Arythmetical avg: sum(digits)/count(digits)
	public static double calculateArythmeticAVG(int value)
	{
		return (double)calculateDigitsSum(value)/calculateLenghtOfNumber(value);
	}
	
	//calculate Geometrical avg: multiply(digits)^1/count(digits)
	public static double calculateGeometricAVG(int value)
	{
		
		return Math.pow((double)calculateDigitsMultipl(value), 1/(double)calculateLenghtOfNumber(value));
	}

}
