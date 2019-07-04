/*
 * CircleSquarer
 * 
 * Version: 1.0
 * 
 * 03.07.2019
 * 
 * Shamshur Aliaksandr
 * 
 */
package shamshur.z1.task3.geometry;

public class CircleSquarer {
	
	//calculates Circle Square by : pi*R^2 by radius
	public static double calculateCircleSquare(double R)
	{
		return Math.PI*Math.pow(R, 2);
	}
	
	//Calculates Ring Square from 2 circles by radius
	public static double calculateRingSquare(double R1, double R2)
	{
		//check on R1 > R2 or R2 > R1 to avoid below zero values
		if (Math.abs(R1)>Math.abs(R2))
		{
			return calculateCircleSquare(R1)-calculateCircleSquare(R2);
		}
		else if(Math.abs(R2)>Math.abs(R1))
		{
			return calculateCircleSquare(R2)-calculateCircleSquare(R1);
		}
		else
		{
			return 0.0d;
		}
	}

}
