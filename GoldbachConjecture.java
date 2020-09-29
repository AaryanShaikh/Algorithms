/*Goldbach's conjecture is a rule in math that states the following: every even number greater than 2 can be expressed as the sum of two prime numbers.
Input: 16
Output:
3 + 13
5 + 11
*/
import java.util.*;
import Aaryan.X;
public class GoldbachConjecture{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=in.nextInt();
		boolean res;
		int sum=0;
		System.out.println("The possible pair are:");
		for(int i=2;i<=num;i++)
		{
			if(X.isPrime(i))
			{
				for(int j=2;j<=num;j++)
				{
					if(X.isPrime(j))
					{
						sum=i+j;
						if(sum==num)
						{
							System.out.println(i+"+"+j+"="+num);
						}
					}
				}
			}
		}
	}
}
