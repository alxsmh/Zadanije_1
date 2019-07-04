/*
 * NumberProgression
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task4.Progressions;


public class NumberProgression {
	
	// gets input as string 
	public static boolean isProgressioned(String value)
	{
		//Length of inputed string number
		int strSize = value.length();
		
		//iterator
		int i = 0;
		
		//markers for reg/prog situations count
		int markerProgress = 0;
		int markerRegress = 0;
		
		//calculation
		//increment markerProgress/markerRegress depending on if next char lower or bigger than previous
		//if reg/prog chain brokes -> break
		while (i<strSize-1)
		{
			if(value.charAt(i)>=value.charAt(i+1))
			{
				markerProgress++;
			}
			else if(value.charAt(strSize-i-1)>=value.charAt(strSize-i-2))
			{
				markerRegress++;
			}
			else
			{
				break;
			}
			i++;
		}
		
		//if markerProgress or markerRegress equals lenght of number from zero. 
		//it means that number has prog/reg chain
		return ((markerProgress == strSize-1)||(markerRegress == strSize-1)) ? true:false;
		
		
	}

}
