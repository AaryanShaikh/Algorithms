/* A number has a strange root if its square and square root share any digit. For example, 2 has a strange root because the square root of 2 equals 1.414 (consider the 
first three digits after the dot) and it contains 4 (which is the square of 2).
Input: 11
Output: true 
(the square root of 11 is 3.317, the square of 11 is 121. They share the same digit, 1.)
Input: 24
Output: false (the square root of 24 (4.899) and square (576) do not share any digits) 
Write a program to check if the user input has a strange root or not.
*/
import java.util.*;
public class StrangeRoot{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number to check if it has a Strange Root");
		try{
			int num = in.nextInt();
			double sqrt = Math.sqrt(num);
			String str = String.format("%.3f",sqrt);
			int sqr = num*num;
			String str2 = String.valueOf(sqr);
			char ch[] = str.toCharArray();
			char ch2[] = str2.toCharArray();
			boolean flag = false;
			System.out.println("Square="+s)
			for (int i=0;i<ch.length ;i++ ) {
				for (int j=0;j<ch2.length ;j++ ) {
					if (ch[i]==ch[j]) {
						System.out.println(ch[i]+"=="+ch[j]);
						flag = true;
					}
				}
			}
			if (flag) {
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}catch(InputMismatchException e){
			System.out.println("Please Enter a valid Number");
		}
	}
}
