/* Given a string as input, create a program to evaluate whether or not its a valid IPv4 address. A valid
IP address should be in the form of a,b,c,d where a,b,c,d are integer values ranging from 0 and 255.
127.0.0.1 -> valid
127.255.255.255 -> valid
257.0.0.1 -> invalid
257a.0.0.1 -> invalid
127.0.0.0.1 -> invalid
*/
import java.util.*;
public class IpAddress{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.replaceAll("[.]", " ");
		String strsplit[] = str.split(" ");
		if (strsplit.length<=4) {
			try{
				if ((Integer.parseInt(strsplit[0])>=0&&Integer.parseInt(strsplit[0])<=255)&&
					(Integer.parseInt(strsplit[1])>=0&&Integer.parseInt(strsplit[1])<=255)&&
					(Integer.parseInt(strsplit[2])>=0&&Integer.parseInt(strsplit[2])<=255)&&
					(Integer.parseInt(strsplit[3])>=0&&Integer.parseInt(strsplit[3])<=255)) {
					System.out.println("Valid");
				}else{
					System.out.println("Invalid");	
				}
			}catch(NumberFormatException e){
				System.out.println("Invalid");
			}
		}else{
			System.out.println("Invalid");
		}
	}
}