import java.util.*;
public class GapfulNumbers{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=in.nextInt();
		int i=0,temp=0;
		temp=num;
		int arr[]=new int[3];
		do{
			arr[i]=num%10;
			num/=10;
			i++;
		}while(num!=0);
		
		int div=(arr[2]*10)+arr[0];
		if(temp%div==0)
		{
			System.out.println("The number is a Gapful Number");
		}
		else
		{
			System.out.println("The number is a not Gapful Number");
		}
	}
}