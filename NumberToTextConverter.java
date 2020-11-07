/* Write a program to convert a number to its text equivalent. (0-9999) supported
*/
import java.util.*;
public class NumberToTextConverter{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		String str[] = num.split("");
		String ones[] = {"","one","two","three","four","five","six","seven","eight","nine"};
		String spec[] = {"eleven","twelve","thirteen","fourteen","fixteen","sixteen","seventeen","eighteen","nineteen"};
		String tens[] = {"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String hund[] = {"hundred"};
		String thou[] = {"thousand"};
		if (num.length()==1) {
			if (num.equals("0")) {
				System.out.println("Zero");
			}else{
				System.out.println(ones[Integer.parseInt(num)-1]);
			}
		}else if (num.length()==2) {
			if (Integer.parseInt(str[0])==1&&Integer.parseInt(str[1])!=0) {
				System.out.println(spec[Integer.parseInt(str[1])-1]);
			}else{
				if (Integer.parseInt(str[0])==1&&Integer.parseInt(str[1])==0) {
					System.out.println(tens[Integer.parseInt(str[1])]);
				}else{
					System.out.println(tens[Integer.parseInt(str[0])-1]+" "+ones[Integer.parseInt(str[1])]);
				}
			}
		}else if(num.length()==3){
			if (Integer.parseInt(str[1])==1&&Integer.parseInt(str[2])!=0) {
				System.out.println(ones[Integer.parseInt(str[0])]+" "+hund[0]+" "+spec[Integer.parseInt(str[2])-1]);
			}else{
				if (Integer.parseInt(str[1])==1&&Integer.parseInt(str[2])==0) {
					System.out.println(ones[Integer.parseInt(str[0])]+" "+hund[0]+" "+tens[Integer.parseInt(str[2])]);
				}else{
					System.out.println(ones[Integer.parseInt(str[0])]+" "+hund[0]+" "+tens[Integer.parseInt(str[1])-1]+" "+ones[Integer.parseInt(str[2])]);
				}
			}
		}else if(num.length()==4){
			if (Integer.parseInt(str[2])==1&&Integer.parseInt(str[3])!=0) {
				System.out.println(ones[Integer.parseInt(str[0])]+" "+thou[0]+" "+ones[Integer.parseInt(str[1])]+" "+hund[0]+" "+spec[Integer.parseInt(str[3])-1]);
			}else{
				if (Integer.parseInt(str[2])==1&&Integer.parseInt(str[3])==0) {
					System.out.println(ones[Integer.parseInt(str[0])]+" "+thou[0]+" "+ones[Integer.parseInt(str[1])]+" "+hund[0]+" "+tens[Integer.parseInt(str[3])]);
				}else{
					System.out.println(ones[Integer.parseInt(str[0])]+" "+thou[0]+" "+ones[Integer.parseInt(str[1])]+" "+hund[0]+" "+tens[Integer.parseInt(str[2])-1]+" "+ones[Integer.parseInt(str[3])]);
				}
			}
		}
	}
}