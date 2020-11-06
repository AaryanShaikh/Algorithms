/* if a number contains each of the digits from 0 to 9 at least once (0 not being the leading digit ), it
is considered to be a pandigital. 
(Easy) -> Write a program to verify whether a given number is pandigital or not.
(Hard) -> In addition to verifying the number being pandigital, display the number of times each digit
appears in that number.
*/
import java.util.*;
public class PandigitalNumbers{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		boolean check = true;
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
		for (int i=0;i<10 ;i++ ) {
			if (num.contains(Integer.toString(i))) {
				continue;
			}else{
				check = false;
			}
		}
		for (int i=0;i<num.length() ;i++ ) {
			arr[Character.getNumericValue(num.charAt(i))]++;
		}
		if (check) {
			System.out.println("The Number is a Pandigital Number");
		}else{
			System.out.println("The Number is not a Pandigital Number");
		}
		for (int i=0;i<arr.length ;i++ ) {
			System.out.println(i+" has occured "+arr[i]+" times");
		}
	}
}