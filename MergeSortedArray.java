/* write a program that reads two sorted arrays from the user input. merges them into third array
 and outputs the result. arrays are sorted in ascending order. for example, the result of merging 
 [1,5,8,9] and [2,3,3,14] is [1,2,3,3,5,8,9,14]
*/
import java.util.*;
public class MergeSortedArray{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String arr1[] = str.split(" ");	
		str = in.nextLine();
		String arr2[] = str.split(" ");
		int marr[] = new int[arr1.length+arr2.length];
		int index = 0,i=0,j=0;
		while(true){
			if (Integer.parseInt(arr1[i])<Integer.parseInt(arr2[j])) {
				marr[index] = Integer.parseInt(arr1[i]);
				index++;
				i++;
			}else{
				marr[index] = Integer.parseInt(arr2[j]);
				index++;
				j++;
			}
			if ((marr.length-1)==index) {
				break;
			}
		}
		if (i<arr1.length) {
					while(i<arr1.length){
						marr[index]=Integer.parseInt(arr1[i]);
						i++;
						index++;
					}
				}else{
					while(j<arr2.length){
						marr[index]=Integer.parseInt(arr2[j]);
						j++;
						index++;
					}
				}
		for (int x=0;x<marr.length ;x++ ) {
			System.out.print(marr[x]+" ");
		}
	}
}