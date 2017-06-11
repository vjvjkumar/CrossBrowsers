package exceptionsTry_Catch_throw_new;

import java.util.Scanner;

public class UnCheckedException_Try_Catch {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		
		int y = scan.nextInt();
		try{
			if (y == 0)
			{
				System.out.println(10 / y);
			}
			else
			{
				System.out.println("Exception did not occur. to see exception, please enter 0");
			}
			y = scan.nextInt();
			System.out.println(10 / y);
		
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception, Divide by Zero Exception ");
		}
	}

}
