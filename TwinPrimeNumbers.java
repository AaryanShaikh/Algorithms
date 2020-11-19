/* A twin prime is a prime number that is either 2 less or 2 more than another prime number. For example
(41, 43) or (149, 151).
Write a program to find the twin prime numbers in a given range.
*/
import java.util.*;
public class TwinPrimeNumbers{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strsplit[] = str.split(",");
		String res = "";
		for (int i=Integer.parseInt(strsplit[0]);i<Integer.parseInt(strsplit[1]) ; i++) {
			if (i==0) {
				continue;
			}
			int temp = i-1;
			boolean check = true;
			while(temp>1){
				if (i%temp==0) {
					check = false;
				}
				temp--;
			}
			if (check) {
				res+=Integer.toString(i)+" ";	
			}
		}
		String primes[] = res.split(" ");
		for (int i=0;i<primes.length; i++) {
			int num = Integer.parseInt(primes[i]);
			int num2 = num+2;
			if (res.contains(Integer.toString(num2))) {
				System.out.print("("+num+", "+num2+") ");
			}
		}
	}
}