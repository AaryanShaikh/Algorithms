import java.util.*;
public class PasswordStrength{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Password");
		String input=in.nextLine();
		char ch[]=input.toCharArray();
		int upper=0,lower=0,num=0,spec=0,space=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				space++;
			}
            else if(ch[i]>='A' && ch[i]<='Z')
			{
				upper++;
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				lower++;
			}
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else
			{
				spec++;
			}
		}
		if(space!=0)
			{
				System.out.println("A password cannot have a space");
				
			}
		else if(((upper>=1&&lower>=1)&&(num>=1&&spec>=1))&&ch.length>=8)
		{
			System.out.println("Password Strength:Great!");
		}
		else if((upper>=1&&lower>=1)&&(num>=1&&spec>=1))
		{
			System.out.println("Password Strength:Good");
		}
		else if(((upper>=1&&lower>=1)&&num>=1)||((upper>=1&&lower>=1)&&spec>=1)||((upper>=1&&num>=1)&&spec>=1)||((lower>=1&&num>=1)&&spec>=1))
		{
			System.out.println("Password Strength:Ok Ok");
		}
		else if((upper>=1&&lower>=1)||(upper>=1&&num>=1)||(upper>=1&&spec>=1)||(lower>=1&&num>=1)||(lower>=1&&spec>=1)||(num>=1&&spec>=1))
		{
			System.out.println("Password Strength:Weak");
		}
		else
		{
			System.out.println("Password Strength:Very Weak!");
		}
	}
}