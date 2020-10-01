/* Write a program to remove Special characters for a givern string
*/
import java.util.Scanner;
public class RemoveSpecialCharacters{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String spec=" !@#$%^&*()+{}|/[]:';,.-`~";
		System.out.println("Enter your input here");
		String input=in.nextLine();
		String str[]=input.split("");
		int spec2=0,k=0;
		for (int i=0;i<str.length;i++) {
			if(spec.contains(str[i]))
			{
				spec2++;
			}
		}
		String str2[]=new String[str.length-spec2];
		for (int i=0;i<str.length;i++) {
			if(!spec.contains(str[i]))
			{
				str2[k]=str[i];
				k++;
			}
		}
		for (int i=0;i<str2.length;i++) {
			System.out.print(str2[i]);
		}
	}
}
