/* A number is considered to be ugly if its only prime factors are 2, 3 or 5. 

[1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …] is the sequence of ugly numbers.
*/
import java.util.*;
public class UglyNumbers{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=in.nextInt();
		boolean res=true;
		//Finding Factors
		for(int i=2;i<=num;i++)
		{
			while(num%i==0)
			{
				num=num/i;
				System.out.println(i);
				if(i==2||i==3||i==5)
				{
					res=true;
				}
				else
				{
					res=false;
				}
			}
		}
		if(res)
		{
			System.out.println("Number is an Ugly Number");
		}
		else
		{
			System.out.println("Number is not an Ugly Number");
		}
	}
}
