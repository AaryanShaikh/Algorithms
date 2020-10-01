/*A lab number is a number such that the square of any of its prime divisors is still one of its divisors.
Input: 8
Output: true (2 is a prime divisor of 8, and 2x2=4 is also a divisor of 8)
*/
import Xero.X;
import java.util.*;
public class LabNumbers
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=in.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(X.isPrime(i))
			{
				if(num%i==0)//Checking Prime divisor
				{
					int res=i*i;
					if(num%res==0)//checking Square of the primes
					{
						System.out.println("Number is a Lab Number");
						count++;break;
					}
				}
			}
		}
		if(count==0)
		{
			System.out.println("Number is not a Lab Number");
		}
	}
}
