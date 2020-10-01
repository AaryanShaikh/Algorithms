// Write a program to check if its leap year or not
import java.util.*;
public class Leap
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the year to check if it's a leap year");
		int year=in.nextInt();
		boolean x=false;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					x=true;
				}
				else
				{
					x=false;
				}
			}
			else
			{
				x=false;
			}
		}
		else
		{
			x=false;
		}
		if(x)
		{
			System.out.println("The year is a leap year");
		}
		else
		{
			System.out.println("The year is not a leap year");
		}
	}
}
