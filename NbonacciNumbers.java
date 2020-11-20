/* The N-Bonacci sequence is where the sum of the preceding N numbers form the  next term. for example
a 3-bonacci sequence is the following
0,0,1,1,2,4,7,13,24,44,81...
write a program which takes two inputs N and M and gets the M-th term of any N-bonacci sequence.
input : 3 13
output: 0 0 1 1 2 4 7 13 24 44 81 149 274
input : 4 13
output: 0 0 0 1 1 2 4 8 15 29 56 108 208
input : 5 25
output: 0 0 0 0 1 1 2 4 8 16 31 61 120 236 464 912 1793 3525 6930 13624 26784 52656 103519 203513 400096
*/
import java.util.*;
public class NbonacciNumbers{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strsplit[] = str.split(" ");
		int n = Integer.parseInt(strsplit[0]);
		int size = Integer.parseInt(strsplit[1]);
		int arr[] = new int[size];
		int sum = 0;
		int count = 0;
		int k = 0;
		for (int i=0;i<size ;i++ ) {
			if (i<n-1) {
				arr[i]=0;
			}else if (i==n-1) {
				arr[i]=1;
			}else{
				sum=0;
				count=0;
				k=i;
				while(count<n){
					sum+=arr[k-1];
					count++;
					k--;
				}
				arr[i]=sum;
			}
		}
		for (int i=0;i<size ;i++ ) {
			System.out.print(arr[i]+" ");
		}
	}
}