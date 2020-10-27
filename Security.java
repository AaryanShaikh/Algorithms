/*You are in charge of security at a casino, and there is a thief who is trying to steal the casino's money!  Look over the security diagrams to make sure that you always
have a guard between the thief and the money! There is one money location, one thief, and any number of guards on each floor of the casino.
Task: 
Evaluate a given floor of the casino to determine if there is a guard between the money and the thief, if there is not, you will sound an alarm.
Input Format:
A string of characters that includes $ (money), T (thief), and G (guard), that represents the layout of the casino floor.  
Space on the casino floor that is not occupied by either money, the thief, or a guard is represented by the character x.
Output Format: 
A string that says 'ALARM' if the money is in danger or 'quiet' if the money is safe.
Sample Input: 
xxxxxGxx$xxxT
Sample Output:
ALARM
Sample Input: 
xxxGGxx$xxGxxT
Sample Output:
quiet
Sample Input: 
T$xxxxxxxxG
Sample Output:
ALARM
*/
import java.util.*;
public class Security{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String res = "";
		for (int i=0;i<str.length() ;i++ ) {
			if (str.charAt(i)!='x') {
				res+=str.charAt(i);
			}
		}
		if (res.indexOf('$')==0) {
			if (res.charAt(1)!='T') {
				System.out.println("quiet");
			}else{
				System.out.println("ALARM");
			}
		}else if(res.indexOf('$')==res.length()-1){
			if (res.charAt(res.length()-2)!='T') {
				System.out.println("quiet");
			}else{
				System.out.println("ALARM");	
			}
		}else{
			if (res.charAt(res.indexOf('$')-1)!='T'&&res.charAt(res.indexOf('$')+1)!='T') {
				System.out.println("quiet");
			}else{
				System.out.println("ALARM");
			}
		}
	}
}
