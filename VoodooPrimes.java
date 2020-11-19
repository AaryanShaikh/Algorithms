/* A Voodoo prime is a prime whose reciprocal (in decimal) has the same number in its digits. 
for example, 7 is voodoo prime because its reciprocal 1/7=0.14285714285 contains 7.
*/
import java.util.*;
public class VoodooPrimes{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		String res = Double.toString(1.0/num);
		if (res.contains(Integer.toString((int)num))) {
			System.out.println("The number is a Voodoo Prime");
		}else{
			System.out.println("The number is not a Voodoo Prime");
		}
	}
}