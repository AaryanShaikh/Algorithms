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