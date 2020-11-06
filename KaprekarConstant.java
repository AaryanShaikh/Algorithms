/* the number 6174 is known as kaprekar's Constant. it is the ultimate convergence point of kaprekar's 
routine, an algorithm thouht up by Indian Mathematician D.R. Kaprekar in 1949.
The routine is as follows:
1. Take any 4-digit number (at least 2 different digits must be used, zeroes allowed).
2. Arrange the digits in decending and ascending order to get two 4-digit numbers.
3. subtact the smaller number from the larger number and get the result.
4. repeat steps 2-4 with new number.
after a few iterations, the algorithm converges to a fixed point and starts to result in the same number
6174- the so called kaprekar's Constant. 
(Easy) -> write a code which will find the kaprekar's constant for any 4 digit number.
(Medium) -> write a code which will find the kaprekar's constant for any number in the range of 101 -
9999, and checking if the digits of the numbers are not too repetitive.
(Hard) -> write a code which will find the kaprekar's constant for any number in the range of 101 -
9999, and checking if the digits of the numbers are not too repetitive and also display all the steps.
*/
import java.util.*;
public class KaprekarConstant{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		int count = 0;
		while(true){
			String strsplit[] = num.split("");
			Arrays.sort(strsplit);
			String num1 = Arrays.toString(strsplit);
			num1 = num1.replaceAll("[^0-9]", "");
			String num2 = new StringBuffer(num1).reverse().toString(); 
			int res = Integer.parseInt(num2)-Integer.parseInt(num1);
			System.out.println(num2+" - "+num1+" = "+res);
			if (res==6174) {
				System.out.println("The Kaprekar's Constant is "+num1+" and "+num2);
				break;
			}else if (count>4) {
				System.out.println("The Kaprekar's Constant is doesn't exist for this number");
				break;
			}else{
				num = Integer.toString(res);
				count++;
			}
		}
	}
}