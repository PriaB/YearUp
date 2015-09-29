
public class CalculatArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double circleAreaInMainMethod = CalculateTwinkie(9);
		System.out.println("Area of the circle is " + circleAreaInMainMethod);
		
		double AreaRect = Spongebob(8,14);
		System.out.println("Area of the rectangle is " + AreaRect);
		
	}	
			
	public static double CalculateTwinkie(int radius)
	{
		double area = 3.14 * radius * radius;
		return area;
		

	
	}
	public static double Spongebob(int length, int width){
		double area = length * width;
		return area;
	}
	}