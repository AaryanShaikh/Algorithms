import java.util.*;
public class StrangeRoot{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number to check if it has a Strange Root");
		try{
			int num = in.nextInt();
			double sqrt = Math.sqrt(num);
			String str = String.format("%.3f",sqrt);
			int sqr = num*num;
			String str2 = String.valueOf(sqr);
			char ch[] = str.toCharArray();
			char ch2[] = str2.toCharArray();
			boolean flag = false;
			System.out.println("Square="+s)
			for (int i=0;i<ch.length ;i++ ) {
				for (int j=0;j<ch2.length ;j++ ) {
					if (ch[i]==ch[j]) {
						System.out.println(ch[i]+"=="+ch[j]);
						flag = true;
					}
				}
			}
			if (flag) {
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}catch(InputMismatchException e){
			System.out.println("Please Enter a valid Number");
		}
	}
}