/* Create a program that checks if in a given String expression all the parenthesis are balanced
(Test) -> valid
(no() -> invalid
()(()) -> valid
(123(456)(7))( -> invalid
(val({}<(0)>lid)) -> valid
*/
import java.util.Stack;
import java.util.Scanner;
public class BalancedParenthesis{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Character> s = new Stack<Character>();
		System.out.println("Enter the expression!!");
		String str = in.nextLine();
		str = str.replaceAll("[A-Za-z0-9]", "");
		for (int i=0;i<str.length() ;i++ ) {
			if (str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='<') {
				s.push(str.charAt(i));
			}
			else if(str.charAt(i)==')'){
				if (s.peek()=='(') {
					s.pop();
				}else{
					System.out.println("Invalid");
					break;
				}
			}
			else if(str.charAt(i)=='}'){
				if (s.peek()=='{') {
					s.pop();
				}else{
					System.out.println("Invalid");
					break;
				}
			}else if(str.charAt(i)==']'){
				if (s.peek()=='[') {
					s.pop();
				}else{
					System.out.println("Invalid");
					break;
				}
			}else if(str.charAt(i)=='>'){
				if (s.peek()=='<') {
					s.pop();
				}else{
					System.out.println("Invalid");
					break;
				}
			}
		}
		if (s.isEmpty()) {
			System.out.println("Valid");
		}else{
			System.out.println("Invalid");
		}
	}
}