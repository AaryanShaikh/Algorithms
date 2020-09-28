import java.util.*;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter any number to check if it's a prime number");
		int n=in.nextInt();
		for(int i=2;i<n;i++)
		{
			int rem=n%i;
			if(rem==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("The number is a prime number");
		}
		else
		{
			System.out.println("The number is not a prime number");
		}
	}
}