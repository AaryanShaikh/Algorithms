/*A Fisher number is an integer whose multipliers are equal to the number's cube. For example, 12 is a Fisher number, because 12^3 = 2 x 3 x 4 x 6 x 12.
Input: 12
Output: true (12^3 = 2 x 3 x 4 x 6 x 12)*/
import java.util.*;
public class FisherNumber
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=in.nextInt();
		int sum=1;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				sum*=i;
			}
		}
		int raise=num*num*num;
		if(raise==sum)
		{
			System.out.println("The number is a Fisher Number");
		}
		else
		{
			System.out.println("The number is not a Fisher Number");
		}
	}
}
