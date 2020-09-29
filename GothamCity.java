/*You are a police officer, and you get a report of criminal activity! Should you go on your own, or should you call a superhero to help you fight the crime? If there 
are less than 5, you can handle this on your own, if there are 5-10, you will want to go with Batman for backup, and if there are more than 10, you should stay where it is
safe and let Batman handle this on his own!
Sample Input: 
7
Sample Output: 
'Help me Batman'*/
import java.util.Scanner;
public class GothamCity{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num = in.nextInt();
		if (num<5) {
			System.out.println("I got this!");
		}
		else if(num>=5&&num<=10){
			System.out.println("Help me Batman!");
		}
		else{
			System.out.println("Good Luck out there!");
		}
	}
}
