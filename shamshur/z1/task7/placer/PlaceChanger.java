/*
 * PlaceChanger
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task7.placer;

public class PlaceChanger {

	//change values between variables 
	//example: a = 128, b= 5 ---> a = 5, b = 128
	public static String changeIntBetween(int a, int b)
	{
		
		a = a-b;
		b = b+a;
		a = b-a;
		
		return (a+","+b);
	}
}
