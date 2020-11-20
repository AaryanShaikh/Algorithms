/* a harshad number (or niven number) is an integer that is divisible by the sum of its digits.
input: 18
output: true (18 is a hardshad number because it is divisible by the sum of its digits: 18 = (1+8)
* 2)
input: 1729
output: true (1729 is a hardshad number because it is divisible by the sum of its digits: 1729 = 
(1+7+2+9)* 91)
*/
import java.util.*;
public class HarshadNumber{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String range = in.nextLine();
		String minmax[] = range.split(" "); 
		int min = Integer.parseInt(minmax[0]);
		int max = Integer.parseInt(minmax[1]);
		while(min<max){
		String num = Integer.toString(min);
		String nums[] = num.split("");
		int sum = 0;
		for (int i=0;i<nums.length ;i++ ) {
			sum+=Integer.parseInt(nums[i]);
		}
		for (int i=0;i<Integer.parseInt(num) ;i++ ) {
			if (Integer.parseInt(num)==sum*i) {
				System.out.print(num+" ");
				break;
			}
		}
		min++;
		}
	}
}