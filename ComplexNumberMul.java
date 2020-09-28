import java.util.*;
public class ComplexNumberMul{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Complex Number");
		int num[]=new int[4];
		for(int i=0;i<num.length;i++)
		{
			num[i]=in.nextInt();
		}
		System.out.println("("+num[0]+"+"+num[1]+"i)*("+num[2]+"+"+num[3]+"i)");
		int res1=num[0]*num[2];
		int res2=(num[0]*num[3])+(num[1]*num[2]);
		int res3=num[1]*num[3];
		if(res3>0)
		{
			res1=res1-res3;
		}
		else
		{
			res1=res3+res1;
		}
		System.out.print("The Solution is:");
		System.out.println(res1+" "+res2+"i");
	}
}