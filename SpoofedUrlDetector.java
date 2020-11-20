/* write a program which will detect the spoofed url and the verify the correct url
input:
Enter the correct URL
www.sololearns.com
Enter the number of test cases
6
www.sololærn.com
www.sololèarn.com
www.so|o|earn.com
www.sololearns.com
www.sololaern.com
www.solo.learn.com
output:
Spoofed:www.solol?rn.com
Spoofed:www.solol?arn.com
Spoofed:www.so|o|earn.com
Verified:www.sololearns.com
Spoofed:www.sololaern.com
Spoofed:www.solo.learn.com
*/
import java.util.*;
public class SpoofedUrlDetector{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the correct URL");
		String url = in.nextLine();
		System.out.println("Enter the number of test cases");
		int tc = in.nextInt();
		in.nextLine();
		String tcs[] = new String[tc];
		for (int i=0;i<tc ;i++ ) {
			tcs[i] = in.nextLine();
		}
		for (int i=0;i<tc ;i++ ) {
			if(url.equals(tcs[i])){
				System.out.println("Verified:"+tcs[i]);
			}else{
				System.out.println("Spoofed:"+tcs[i]);
			}
		}
	}
}