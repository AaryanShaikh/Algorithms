//Program to check if the number is Fisher Number or not
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