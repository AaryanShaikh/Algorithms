/*If the sum of factors of a number is greater than twice that number, it is considered to be abundant
For example:
12 is an abundant number.
factors of 12 are 1,2,3,4,6,12 
sum is 1+2+3+4+6+12=28>2*12
*/
import java.util.*;
public class AbundantNumbers{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=in.nextInt();
		int res=1;
		System.out.print("The factors are: ");
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(" "+i);
				res+=i;
			}
		}
		System.out.println("="+res);
		if(res>(2*num))
		{
			System.out.println("The Number is an Abundant Number");
		}
		else
		{
			System.out.println("The Number is not an Abundant Number");
		}
	}
}
