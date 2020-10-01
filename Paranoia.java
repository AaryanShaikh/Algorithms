/*ByteCorp is a famous technological company in Byteania. 
The CEO of ByteCorp doesn't trust anyone and thinks that his accountant managed to move huge amounts of money to a competitor company, MegaCorp.
He hires a computer crime investigator, and asks him to find inconsistencies in the money transfers.
Here is a sample transaction log of the company:
Feb SLR 4 M
Feb ENT 800 K
Mar SLR 4000 K
Mar ENT 800 K
Apr SLR 4010 K
Apr ENT 810 K

There are four columns:
1. Month of the transaction
2. Reason of the expense (SLR for "salary", ENT for "entertainment", OTR for "other")
3. Amount
4. M, K, or B (M for million, K for thousands, B for billion)

In the example above, April expenses show an inconsistency and should be reported.
As the computer investigator, write a program, which reads the transaction logs, detects inconsistent expenses and prints the exact month containing the "unusual" activities.
*/
import java.util.*;
public class Paranoia{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number records");
		int rec = in.nextInt();
		in.nextLine();
		String month[] = new String[rec];
		String reason[] = new String[rec];
		String amt[] = new String[rec];
		System.out.println("Enter the Records!");
		for (int i=0;i<rec ;i++ ) {
			String str = in.nextLine();
			String strsplit[] = str.split(" ");
			month[i] = strsplit[0];
			reason[i] = strsplit[1];
			amt[i] = strsplit[2];
		}
		int flag=0;
		System.out.println("********** ByteCorp **********");
		for (int i=0;i<rec;) {
			if (amt[i++].equals("4000") && amt[i++].equals("800") && amt[i++].equals("1190")) {}
			else{
				if (reason[i-1].equals("SLR")) {
					System.out.println("Unusual Activities with Salary in the month of "+month[i-1]);
				}else if (reason[i-1].equals("ENR")) {
					System.out.println("Unusual Activities with Entertainment Expenses in the month of "+month[i-1]);
				}
				else{
					System.out.println("Unusual Activities Detected with Other Expenses in the month of "+month[i-1]);	
				}
			}
		}
	}
}
