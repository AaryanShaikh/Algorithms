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