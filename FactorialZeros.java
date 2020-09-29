/*The factorial of a non-negative integer n, denoted by n! is the product of all positive integers less than or equal to n.
Input: 5
Output: 1 (5! = 120 has one trailing zero)*/
import Aaryan.X;
import java.util.*;
class FactorialZeros
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number to check the Trailling zeros");
		int n=in.nextInt();
		int dig,count=0;
		int res=X.doFact(n);
		int temp=res;
		while(temp!=0)
		{
			dig=temp%10;
			if(dig==0)
			{
				count++;
			}
			else
			{
				break;
			}
			temp/=10;
		}
		System.out.println("The number "+n+" has "+count+" trailling zeros");
	}
}
