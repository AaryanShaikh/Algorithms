import java.util.Scanner;
public class DejaVu{
	public static void main(String[] args) {
	 	Scanner in=new Scanner(System.in);
	 	System.out.println("Enter the String");
	 	String str = in.nextLine();
	 	char ch[] = new char[str.length()];
	 	for (int i=0;i<str.length() ;i++ ) {
	 		ch[i] = str.charAt(i);
	 	}
	 	//checking if occurences are there
	 	boolean flag = true;
	 	for (int i=0;i<ch.length ;i++ ) {
	 		for (int j=1;j<ch.length-1 ;j++ ) {
	 			if (ch[j]==ch[j+1]) {
	 				flag = false;
	 			}
	 		}
	 	}
	 	if (flag) {
	 		System.out.println("Unique");
	 	}
	 	else{
	 		System.out.println("Deja Vu");
	 	}
	 } 
}