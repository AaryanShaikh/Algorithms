/*You are getting ready to paint a piece of art. The canvas and brushes that you want to use will cost 40.00. Each color of paint that you buy is an additional 5.00.
Determine how much money you will need based on the number of colors that you want to buy if tax at this store is 10%.
Task 
Given the total number of colors of paint that you need, calculate and output the total cost of your project rounded up to the nearest whole number.
Sample Input 
10
Sample Output 
99
*/
import java.util.*;
public class PaintCosts{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float num = in.nextFloat();
		float res = num*5;
		res = res + 40;
		float res1 = res / 100;
		res1 = res1*10;
		res = res1 + res;
		res = Math.ceil(res);
		int resf = (int)res; 
		System.out.println(resf);
	}
}
