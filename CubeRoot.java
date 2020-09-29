/*A cube root of a number x is a number y such that y*y*y = x.
For example:
Input: 729
Output: 9*/
import java.util.*;
public class CubeRoot{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number to find it's Cube Root");
		int num = in.nextInt();
		int res = 0, i = 0;
		boolean flag = true;
		for (i=0;i<=num;i++) {
			res = i*i*i;
			if(res==num){
				System.out.println("The Cube Root of the Number "+num+" is:"+i);
				flag = false;
			}
		}
		if (flag && (i-1)==num) {
			System.out.println("The Cube Root of this Number does not exist");
		}
	}
}
