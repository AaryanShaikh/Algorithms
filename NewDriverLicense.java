/*You have to get a new driver's license and you show up at the office at the same time as 4 other people. The office says that they will see everyone in alphabetical order 
and it takes 20 minutes for them to process each new license. All of the agents are available now, and they can each see one customer at a time. How long will it take for you 
to walk out of the office with your new license?
Task 
Given everyone's name that showed up at the same time, determine how long it will take to get your new license.
Input Format 
Your input will be a string of your name, then an integer of the number of available agents, and lastly a string of the other four names separated by spaces.
Output Format 
You will output an integer of the number of minutes that it will take to get your license.
Sample Input
'Eric'
2
'Adam Caroline Rebecca Frank'
Sample Output 
40
*/
import java.util.*;
public class NewDriverLicense{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int num = in.nextInt();
		in.nextLine();
		String str2 = in.nextLine();
		str2 = str2+" "+str;
		String names[] = str2.split(" ");
		Arrays.sort(names);
		int time = 0;
		boolean isComp = false;
		for (int i=0;i<names.length; ) {
			int k=0;
			time+=20;
			while (k<num&&i<names.length) {
				if (names[i].equals(str)) {
					isComp = true;
					break;
				}
				i++;
				k++;	
			}
			if (isComp) {
				break;
			}
		}
		System.out.println(time);
	}
}
