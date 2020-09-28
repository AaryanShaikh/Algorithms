import java.util.*;
public class PythagoreanTriples{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number to find its Pythagorean Triples!");
		int num = in.nextInt();
		int res,flag=0;
		for (int a=1;a<num ;a++ ) {
			for (int b=a+1;b<num ;b++ ) {
				for (int c=b+1;c<num ;c++ ) {
					res = a+b+c;
					if (res==num && (a*a)+(b*b)==(c*c)) {
						System.out.println(a+" "+b+" "+c);
						flag=1;
						break;
					}
				}
			}
		}
		if (flag==0) {
			System.out.println("No triple");
		}
	}
}