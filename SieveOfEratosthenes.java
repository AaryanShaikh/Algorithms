/* Write a program which finds all the primes less than a given number using Sieve of Eratosthenes Algorithm
and also show all the steps.
*/
import java.util.*;
public class SieveOfEratosthenes{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int arr[] = new int[num-1];
		int rem[] = new int[num-1];
		int k=2;
		for (int i=0;i<arr.length ;i++ ) {
			arr[i] = k;
			k++;
			rem[i] = 0;
		}
		System.out.print("List:[");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]\n\n");
		for (int i=0;i<arr.length ;i++ ) {
			 if (rem[i]==1) {
			 	continue;
			 }
			 num = arr[i];
			 System.out.println("Remove all the multiples of "+num+"\n");
			 k=i+1;
			 while(true){
			 	try{
			 		if (arr[k]%num==0) {
			 			rem[k] = 1;
			 			k++;
			 		}else{
			 			k++;
			 		}
			 	}catch(Exception e){
			 		break;
			 	}
			 }
			 System.out.print("List:[");
			 for (int j=0;j<arr.length ;j++ ) {
			 	if (rem[j]==0) {
			 		System.out.print(arr[j]+" ");
			 	}
			 }
			 System.out.print("]\n\n");
		}
		System.out.println("No more numbers left. All the primes are in the list");
	}
}