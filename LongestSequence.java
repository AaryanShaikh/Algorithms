/* Given a series of numbers , find the longest sequence in the series. A sequence could be one of
the following:
An Ascending Sequence
Example: 
Input: 836926
Output: 369
An Descending Sequence
Example: 
Input: 2995316
Output: 9531
An Equal Sequence
Example: 
Input: 255566
Output: 555 
(Easy) -> Write a program that reads a series of numbers from the input and finds the longest asce
nding, descending or equal sequence in the series.
(medium) -> Write a program to find all of the sequences above. 
*/
import java.util.*;
public class LongestSequence{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String temp = "";
		String maxd = "0";
		String maxa = "0";
		String maxe = "0";
		for (int i=0;i<str.length()-1 ;i++ ) {
			temp = Character.toString(str.charAt(i));
			int k=i;
			if (Character.getNumericValue(str.charAt(k))>Character.getNumericValue(str.charAt(k+1))) {
				while(((k+1)<str.length()-1)&&(str.charAt(k)>str.charAt(k+1))){
					temp+=Character.toString(str.charAt(k+1));
					k++;
				}
			}
			if (Integer.parseInt(temp)>Integer.parseInt(maxd)) {
				maxd=temp;
			}
			temp = Character.toString(str.charAt(i));
			 k=i;
			if (Character.getNumericValue(str.charAt(k))<Character.getNumericValue(str.charAt(k+1))) {
				while(((k+1)<str.length()-1)&&(str.charAt(k)<str.charAt(k+1))){
					temp+=Character.toString(str.charAt(k+1));
					k++;
				}
			}
			if (Integer.parseInt(temp)>Integer.parseInt(maxa)) {
				maxa=temp;
			}
			temp = Character.toString(str.charAt(i));
			k=i;
			if (Character.getNumericValue(str.charAt(k))==Character.getNumericValue(str.charAt(k+1))) {
				while(((k+1)<str.length()-1)&&(str.charAt(k)==str.charAt(k+1))){
					temp+=Character.toString(str.charAt(k+1));
					k++;
				}
			}
			if (Integer.parseInt(temp)>Integer.parseInt(maxe)) {
				maxe=temp;
			}
		}
		System.out.println("The longest Ascending Sequence is "+maxa);
		System.out.println("The longest Descending Sequence is "+maxd);
		System.out.println("The longest Equal Sequence is "+maxe);
	}
}