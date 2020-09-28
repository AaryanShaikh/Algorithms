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