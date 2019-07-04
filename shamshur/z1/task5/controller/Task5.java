/*
 * Task5
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package shamshur.z1.task5.controller;
import static shamshur.z1.task5.math.AvgCalculations.calculateArythmeticAVG;
import static shamshur.z1.task5.math.AvgCalculations.calculateGeometricAVG;
import static shamshur.z1.inputRevisor.OutputHelper.print;

public class Task5 {

	public static void main(String[] args) {

		//output Arythmetical avg
		print("ARY AVG OF 13662: %.5f",calculateArythmeticAVG(13662));
		
		//output Geometrical avg
		print("\nGEO AVG OF 74297: %.5f",calculateGeometricAVG(74297));
	}

}
