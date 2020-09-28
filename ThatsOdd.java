import java.util.Scanner;
public class ThatsOdd{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size = in.nextInt();
		int ele[] = new int[size];
		for (int i=0;i<size ;i++ ) {
		 	ele[i] = in.nextInt();
		 }
		 int sum = 0;
		 for (int i=0;i<size ;i++ ) {
		  	if (ele[i]%2==0) {
		  		sum = sum+ele[i];
		  	}
		  }
		  System.out.println(sum); 
	}
}