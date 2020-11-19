/* There are 100 boxes, 99 of them weight in the range of 10 to 20 kilograms. only one box falls 
outside of the range. it can be lighter or heavier.
Write a program to find the box that falls outside the range.
Recommendation:
Write a random array generator first, which follows the rule and initializes an array with the
corresponding weights. Then try to find the specific box.  
*/
import java.util.*;
public class FindTheBlackBox{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer boxes[] = new Integer[100];
		for (int i=0;i<99 ;i++ ) {
			boxes[i] = (int)(Math.random() * (20 - 10 + 1) + 10);	
		}
		boxes[99] = (int)(Math.random() * (30 - 0 + 1) + 0);
      	while(boxes[99]>10 && boxes[99]<20){
      		boxes[99] = (int)(Math.random() * (30 - 0 + 1) + 0);
      	}
		List<Integer> intList = Arrays.asList(boxes);
		Collections.shuffle(intList);
		intList.toArray(boxes);
		for (int i=0;i<100 ;i++ ) {
			if (boxes[i]>20) {
				System.out.println("The Black box is found at box no "+(i+1)+" and is heavier");
				break;
			}
			if (boxes[i]<10) {
				System.out.println("The Black box is found at box no "+(i+1)+" and is lighter");
				break;
			}
		}
	}
}
