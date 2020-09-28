import java.util.*;
public class PrimeStrings{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to check if its Prime or not");
		String str = in.nextLine();
		char ch1[] = new char[str.length()/2+1];
		char ch2[] = new char[str.length()/2+1];
		int index1 = 0, index2 = 0;
		for (int i=0;i<str.length() ;i++ ) {
			if (i<str.length()/2) {
				ch1[index1++] = str.charAt(i);
			}else{
				ch2[index2++] = str.charAt(i);
			}
		}
		str = new String(ch1);
		String str2 = new String(ch2);
		if (str.equals(str2)) {
			System.out.println("Not Prime");
		}else{
			System.out.println("Prime");
		}
	}
}