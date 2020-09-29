/*A howling prime is a prime number if the sum of its digits is also a prime number.
Input:113
Output: true (113 is a prime number, 1+1+3=5 is also a prime number)
*/
import Aaryan.X;
import java.util.*;
public class HowlingPrime
{
	public static void main(String[] args)
	{
		int dig,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("1.Single \n2.Range");
		int cho=in.nextInt();
		switch(cho)
		{
			case 1:System.out.println("Enter the Number");
					int num=in.nextInt();
					boolean res=X.isPrime(num);//This method is in my X class
					int len=String.valueOf(num).length();//find the length of the int
					int temp=num;
					if(res==true)
					{
						while(temp>0)
						{
							dig=temp%10;
							sum+=dig;
							temp=temp/10;
						}
						boolean res2=X.isPrime(sum);
						if(res2==true)
						{
							System.out.println(num+" is a Prime Number & Howling Prime Number");
						}
						else
						{
							System.out.println(num+" is a Prime Number but not a Howling Prime Number");
						}
					}
					else
					{
						System.out.println(num+" is not a Prime Number");
					}
					break;
			case 2:System.out.println("Enter the Starting number");
					int num3=in.nextInt();
					System.out.println("Enter the Ending number");
					int num4=in.nextInt();
					for(int i=num3;i<=num4;i++)
					{
						res=X.isPrime(i);
						temp=i;
						if(res==true)
						{
							while(temp>0)
							{
								dig=temp%10;
								sum+=dig;
								temp=temp/10;
							}
							boolean res2=X.isPrime(sum);
							if(res2==true)
							{
								System.out.println(i+" is a Prime Number & Howling Prime Number");
							}
							else
							{
								System.out.println(i+" is a Prime Number but not a Howling Prime Number");
							}
						}
						else
						{
							System.out.println(i+" is not a Prime Number");
						}
					}
					break;
		}
	}
}
