/* n people (numbered 1 to n) are standing in a circle. Person 1 kills person 2 with a sword/knife and 
gives it to person 3. person 3 kills person 4 with sword/knife and gives it to person 5. this process
is repeated until only one person is alive.
(medium) -> given the number of people N, write a program to find the person that stays alive at the 
end.
(Hard) -> Show each step of the process.
*/
import java.util.*;
public class JosephusProblem{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		Arrays.fill(arr,0);
		int i=0,count=0;
		boolean once = true;
		while(true){
			if (arr[i]==0) {
				int k=(i+1)%n;
				while(arr[k%n]!=0){
					k=(k+1)%n;
				}
				if (arr[k%n]==0) {
					boolean ch = ((k+1)!=n)?true:false;
					if (ch) {
						boolean ch2 = ((i+1)!=n)?true:false;
						if (ch2) {
							if (once) {
								System.out.print((i+1)%n+" will kill "+(k+1)%n);
								once = false;
							}else{
								System.out.print((i+1)%n+"\n"+(i+1)%n+" will kill "+(k+1)%n);
							}
							boolean ch3 = ((k+2)!=n)?true:false;
							if (ch3) {
								System.out.print(" and will give the knife to ");
							}else{
								System.out.print(" and will give the knife to ");
							}
						}else{
							System.out.print(n+" will kill "+(k+1)%n);
							boolean ch3 = ((k+2)!=n)?true:false;
							if (ch3) {
								System.out.print(" and will give the knife to ");
							}else{
								System.out.print(" and will give the knife to ");
							}
						}
					}else{
						boolean ch2 = ((i+1)!=n)?true:false;
						if (ch2) {
							System.out.print((i+1)%n+" will kill "+n);
							boolean ch3 = ((k+2)!=n)?true:false;
							if (ch3) {
								System.out.print(" and will give the knife to ");
							}else{
								System.out.print(" and will give the knife to ");
							}
						}else{
							System.out.print(n+" will kill "+n);
							boolean ch3 = ((k+2)!=n)?true:false;
							if (ch3) {
								System.out.print(" and will give the knife to ");
							}else{
								System.out.print(" and will give the knife to ");
							}
						}
					}
					arr[k%n] = 1;	
				}
			}
			count=0;
			for (int j=0;j<n ;j++ ) {
				if (arr[j]==0) {
					count++;
				}
			}
			if (count==1) {
				break;
			}
			i=(i+1)%n;
		}
		for (int j=0;j<n ;j++ ) {
			if (arr[j]==0) {
				System.out.println((j+1)+"\n"+(j+1)+" survived!");
				break;
			}
		}
	}
}