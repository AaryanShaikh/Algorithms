import java.util.*;
public class YoutubeLinkFinder{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(str.charAt(16)=='/');
		System.out.println(str.charAt(16));
		if (str.charAt(16)=='/') {
			for (int i=17;i<str.length() ;i++ ) {
				System.out.print(str.charAt(i));
			}
		}else{
			for (int i=31;i<str.length() ;i++ ) {
				System.out.print(str.charAt(i));
			}
		}
	}
}