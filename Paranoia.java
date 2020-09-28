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