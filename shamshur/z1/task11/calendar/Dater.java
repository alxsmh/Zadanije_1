/*
 * Dater
 * 
 * Version: 1.0
 * 
 * 04.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task11.calendar;

public class Dater {

	//return string that contain next day date
	public static String calculateNextDate (int day, int month, int year)
	{
		//if year, month or day is/are invalid
		//return ERROR
		if(!isValidDay(day,month,year))
		{
			return "ERROR";
		}
		else
		{
			//check validity of incremented day
			//if true, return string representation of next day
			//example: "25.03.1994"
			
			if(isValidDay(day+1,month,year))
			{
				return buildStrDate(++day, month, year);
			}
			//if false, that means day out of month range
			//day drops to 01
			//increment month
			else
			{
				day = 01;
				month++;
				
				//new year check
				//if month is invalid, that means its larger than 12
				//month drops to 01
				//increment year
				//else next day is first of next month
				return (isValidDay(day,month,year))? buildStrDate(day, month, year):buildStrDate(day, 01, ++year);
			}
		}
	}
	
	//check if inputed year is Leap year
	//google: grigorean calendar!
	public static boolean isLeap (int year)
	{
		//leap year divides on 4 or 400 
		//leap year dont divides on 100
		//example
		//leap years: 1600, 1864, 2000, 2012
		//not leap years: 1800, 1991, 2006
		if ((year%4 == 0) && (year%100 != 0 || year%400 == 0) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//check validnes of day,year,month
	public static boolean isValidDay (int day, int month, int year)
	{
		// if day or year <0 return false
		if ((day <= 0)||(year < 0))
		{
			return false;
		}
		
		//if month <= 0 return false
		//else check day validness by month
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (day <= 31)
				{
					return true;
				}
				break;
			
			case 4:
			case 6:
			case 9:
			case 11:
				if (day <= 30)
				{
					return true;
				}
				break;
				
			//February check
			//if its leap year
			//true : days in februrary 29
			//false: days in februrary 28
			case 2:
				if(isLeap(year))
				{
					if (day <= 29)
					{
						return true;
					}
				}
				else
				{
					if (day <= 28)
					{
						return true;
					}
				}
				
				default:
					return false;
		}
		
		return false;
	}
	
	//builds string from day,month,year to "day.month.year"
	static String buildStrDate(int day, int month, int year)
	{	
		return buildValidStrOnDateOrMonth(day) + buildValidStrOnDateOrMonth(month) + year;
	}	
	
	//if day or month equals from 1 to 9, adds 0 in front
	static String buildValidStrOnDateOrMonth(int a)
	{
		if (a < 10)
		{
			return "0"+String.valueOf(a)+".";
		}
		else
		{
			return String.valueOf(a)+".";
		}
	}
}
