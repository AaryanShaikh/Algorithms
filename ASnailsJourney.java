/* Each day the snail climbs up A meters on a tree with H meters in height.
At night it goes down B meters.
Write a program which takes 3 inputs H,A,B and calculates how many days it'll take for the snail 
to get to the top of the tree.
Required H>A>B. 
*/
import java.util.*;
public class ASnailsJourney{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the values of H,A,B. example (15,1,0.5)");
		String str = in.nextLine();
		String strsplit[] = str.split(",");
		double h = Double.parseDouble(strsplit[0]);
		double a = Double.parseDouble(strsplit[1]);
		double b = Double.parseDouble(strsplit[2]);
		if ((h>a)&&(a>b)) {
			int days = 0;
			double mtsclimbed = 0;
			while(mtsclimbed!=h&&mtsclimbed<h){
				mtsclimbed+=a;7
				mtsclimbed-=b;
				days++;
			}
			System.out.println("It will take "+days+" days for the snail to climb the tree.");
		}
		else{
			System.out.println("The values of H,A,B should be in the form H>A>B ");
		}
	}
}