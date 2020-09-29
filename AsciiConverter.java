//ASCII abbreviated from American Standard Code for Information Interchange, is a character encoding standard for electronic communication.
/*For example:
Input: "abc"   
Output: 97 98 99*/
import java.util.*;
public class AsciiConverter{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		char ch[]=str.toCharArray();
		int arr[]=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			arr[i]=ch[i];
			System.out.print(arr[i]+" ");
		}
	}
}
