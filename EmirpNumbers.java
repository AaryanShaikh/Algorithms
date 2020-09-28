//Program to test Emirp Numbers
import Aaryan.X;
import java.util.*;
class EmirpNumbers
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number to check if the number is Emirp Number or not");
		int n=in.nextInt();
		int rev=X.doRev(n);
		boolean res=X.isPrime(rev);
		if(res)
		{
			System.out.println(n+" is a Emirp number");
		}
		else
		{
			System.out.println(n+" is not a Emirp number");
		}
	}
}
