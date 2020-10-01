/* A number is called a Spy number, if the sum and product of its digits are equal.
For example, 123 is a Spy number, as the sum of its digits is 6 (1+2+3) which is equal to the product of its digits: 6 (1x2x3).
Input: 1412
Output: true
*/
import java.util.Scanner;
public class SpyNumber{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=in.nextInt();
		int arr[]=new int [String.valueOf(num).length()];
		int sum=0,prod=1,i=0;
		while(num!=0){
			arr[i]=num%10;
			i++;
			num/=10;
		}
		for (i=0;i<arr.length;i++) {
			sum+=arr[i];
			prod*=arr[i];
		}
		if(sum==prod)
		{
			System.out.println("Number is a Spy Number");
		}
		else
		{
			System.out.println("Number is not a Spy Number");	
		}
	}
}
