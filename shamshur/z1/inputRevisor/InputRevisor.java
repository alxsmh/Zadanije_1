/*
 * InputRevisor
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.inputRevisor;

//class for some manipulations with digits in INT numbers
public class InputRevisor {
	
	//calculate sum of digits in int number by lasts of division on 10
	public static int calculateDigitsSum(int value)
	{
		int sum = 0;
		int tmp = returnABS(value);
				

		while (tmp>0)
		{
			sum+= tmp%10;
			tmp = tmp/10;
		}
		
		return sum;
	}
	
	//calculate multiplication of digits in int number by lasts of division on 10
		public static int calculateDigitsMultipl(int value)
		{
			int mult = 1;
			int tmp = returnABS(value);
					

			while (tmp>0)
			{
				mult*= tmp%10;
				tmp = tmp/10;
			}
			
			return mult;
		}
	
	//calculate length of number while there are lasts of division on 10
	public static int calculateLenghtOfNumber(int value)
	{
		int len = 0;
		int tmp = returnABS(value);
		
		if(tmp == 0)
		{
			len++;
		}
		else
		{
		
			while (tmp>0)
			{
				tmp = tmp/10;
				len++;
			}
		}
		
		return len;
	}
	
	//check if value equals or upper than zero
	//else: return value*-1
	public static int returnABS(int value)
	{
		return (value >= 0) ? value:value*-1;
	}
	
}
