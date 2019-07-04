/*
 * TypeConverter
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */

package shamshur.z1.inputRevisor;


//converts all primitive numbers to float type
//!! experemental, handle with great care, might be invalid conversions
public class TypeConverter {

	public static float makeFloatValue(int value)
	{
		return (float)value;
	}
	
	public static float makeFloatValue(long value)
	{
		return (float)value;
	}
	
	public static float makeFloatValue(double value)
	{
		return (float)value;
	}
	
	public static float makeFloatValue(short value)
	{
		return (float)value;
	}
	
	public static double makeFloatValue(byte value)
	{
		return (float)value;
	}
	
	public static String makeStringFromInt(int value)
	{
		try 
		{
			return String.valueOf(value);
		}
		finally
		{
			
		}
	}
	
}
