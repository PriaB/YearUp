import java.util.Scanner;

public class TipCalculator 
{

	public static void main(String[] args) 
	{
		System.out.println("*****Welcome to the Year Up Tip Calculator*****");
		System.out.println("What was the price of your bill:");
		Scanner sc = new Scanner(System.in);
		double checkAmount = sc.nextDouble();
		
		double tip15 = checkAmount * 0.15;
		double totalFor15 = checkAmount + tip15;
		System.out.format("The 15 percent tip for this check is %3.2f%n", totalFor15);
		
		double tip20 = checkAmount * 0.2;
		double totalFor20 = checkAmount + tip20;
		System.out.format("The 20 percent tip for this check is %3.2f%n", totalFor20);
		
		double tip25 = checkAmount * 0.25;
		double totalFor25 = checkAmount + tip25;
		System.out.format("The 25 percent tip for this check is %3.2f%n", totalFor25);
	}

}


