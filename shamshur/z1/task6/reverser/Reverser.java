/*
 * Reverser
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task6.reverser;
import static shamshur.z1.inputRevisor.InputRevisor.returnABS;

public class Reverser {
	
	//revrse of int number by division on 10
	public static int reverseInt(int value)
	{
		int result = 0;
		int tmp = returnABS(value);
		
        while(tmp > 0) 
        {
        	//example 10*10 + v = 10v
            result = result * 10 + tmp % 10;
            tmp /= 10;
        }
        
        return (value>0)? result:result*-1;
	}

}
