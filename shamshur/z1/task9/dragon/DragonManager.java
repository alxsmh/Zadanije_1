/*
 * DragonManager
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task9.dragon;

public class DragonManager {
	
	static int youngDragonIncrement = 3;
	static int matureDragonIncrement = 2;
	static int oldDragonIncrement = 1;

	//treshold for heads grow
	final static int youngAge = 0;
	final static int matureAge = 200;
	final static int oldAge = 300;
	
	//return heads
	public static int calculateHeads(int age)
	{
		int heads = 0;
		
		heads += headIncrimenter(age,oldAge,oldDragonIncrement);
		
		return heads;
	}
	
	//return eyes
	public static int calculateEyes(int age)
	{
		int eyesPerHead = 2;
		
		return calculateHeads(age)*eyesPerHead ;
	}
	
	/*
	 * calculate heads
	 * 
	(age - diffAge) * diifIncrement
	nextAge = diffAge
	diffAge = nextDiffAge
	difIincrement++
	*
	recursive ((nextAge - nextDiffAge) * diifIncrement)
	*/
	 
	static public int headIncrimenter(int age, int treshold, int inc)
	{
		int heads = 0;
		
		if (age >= treshold)
		{
			heads += (age-treshold) * inc;
			
			age = treshold;
		}	
		
		// check threshold status and replace current by next
		switch(treshold)
		{
			case oldAge : treshold = matureAge; break;
			case matureAge : treshold = youngAge; break;
			default : 
				treshold = -1; 
				//dragon will born with 3 heads
				if (age == 0)  
				{
					heads+=youngDragonIncrement;
				} 
				
				break;
		}
		
		//recursion
		return (treshold >= 0)? heads+headIncrimenter(age, treshold, ++inc) : heads;
	}

}
