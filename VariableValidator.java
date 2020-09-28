import java.util.*;
public class VariableValidator{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String spec=" !@#$%^&*()+{}|/[]:';,.-`~";
		String prog[]={"if","else","for","while","do","extends","implements","class"};
		System.out.println("Enter the Variable");
		String name=in.nextLine();
		String str[]=name.split("");
		int num=0,spec2=0,prog2=0;
		for(int i=0;i<prog.length;i++)
		{
			if(name.equals(prog[i]))
			{
				prog2++;
			}
		}
		for(int i=0;i<str.length;i++)
		{
			if(Character.isDigit(str[0].charAt(0)))
			{
				num++;
			}
			else if(spec.contains(str[i]))
			{
				spec2++;
			}
			else
			{
				
			}
		}
		if((num==0&&spec2==0)&&prog2==0)
		{
			System.out.println("The Variable is Valid");
		}
		else
		{
			System.out.println("The Variable is not Valid");
		}
	}
}