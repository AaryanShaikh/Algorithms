/* Pronic number is a number which is the product of two concecutive integers, that is n=x*(x+1).
*/
import java.util.*;
public class PronicNumbers{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i=0;i<num ;i++ ) {
			if (num==(i*(i+1))) {
				System.out.println("Number is a Pronic Number");
				return;
			}
		}
		System.out.println("Number is not a Pronic Number");
	}
}