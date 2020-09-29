/*The Collatz conjecture (also known as the Ulam conjecture or the Syracuse problem) is an unsolved mathematical problem, which is very easy to formulate:
1. Take any natural number
2. If it's even, half it, otherwise triple it and add one
3. Repeat step 2. until you reach 4, 2, 1 sequence
4. You will ALWAYS reach 1, eventually.
*/
import java.util.*;
public class CollatzConjecture{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of X");
		int num=in.nextInt();
		int res=0;
		do
		{
				if(num%2==0)
				{
					res=num/2;
					System.out.println(num+"/2="+res);
					num=res;
				}
				else
				{
					res=(num*3)+1;
					System.out.println(num+"*3+1="+res);
					num=res;
				}
		}while(res!=1);
	}
}
