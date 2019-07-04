package shamshur.z1.task8.triangle;
import static shamshur.z1.inputRevisor.OutputHelper.print;

public class PointManager {
	
	static String triangleMSG = "Yes, this is a triangle";
	static String notTriangleMSG = "No, this is not a triangle";
	static String rectanTriangleMSG = "And it's rectangular";
	static String notRectanTriangleMSG = "But it's not a rectangular";
	
	// check if x1,x2,x3 are equal
	static boolean compareThreeCordsAllEQ(int x1, int x2, int x3)
	{
		if ((x1 == x2) && (x2 == x3))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// check if x1,x2 or x2,x3 are equal
		static boolean compareThreeCordsTwoEQ(int x1, int x2, int x3)
		{
			if ((x1 == x2) || (x2 == x3)|| (x1 == x3))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	
	//check if it's a triangle, by comparing x1,x2,x3 and y1,y2,y3
	//if x block or y block is/are equal, it's not a triangle
	public static boolean isTriangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		if (compareThreeCordsAllEQ(x1,x2,x3))
		{
			return false;
		}
		else if (compareThreeCordsAllEQ(y1,y2,y3))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	//check if triangle is rectangular
	//y1,y2 or y2,y3 or y1,y3 must be equal, same as Xs
	public static boolean isRectangularTriangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		if ((compareThreeCordsTwoEQ(x1,x2,x3))&&(compareThreeCordsTwoEQ(y1,y2,y3)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//function checks if inputed dots
	//x1,y1, x2,y2, x3,y3
	//making a triangle
	//and if triangle is made -> check if its Rectangular triangle
	//
	//console output for results of checking the coordinates
	public static void triangleCheck (int x1, int y1, int x2, int y2, int x3, int y3)
	{
		if(isTriangle(x1,y1,x2,y2,x3,y3))
		{
			print(triangleMSG);
			
			if(isRectangularTriangle(x1,y1,x2,y2,x3,y3))
			{
				print(rectanTriangleMSG);
			}
			else
			{
				print(notRectanTriangleMSG);
			}
		}
		else
		{
			print(notTriangleMSG);
		}
	}
	
}
