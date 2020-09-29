/*A number is considered deficient if the sum of its factors is less than twice that number
For Example:
10 is a deficient number.
Factors of 10 are 1, 2, 5, 10
Sum is 1 + 2 + 5 + 10 = 18 < 2 * 10*/
import java.util.*;
public class DeficientNumbers{
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
		if(res<(2*num))
		{
			System.out.println("The Number is an Deficient Number");
		}
		else
		{
			System.out.println("The Number is not an Deficient Number");
		}
	}
}
