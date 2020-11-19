/* An Owl matrix is a symmetric matrix that could be "folded" vertically and horizontally in the
middle and would generate four equal pieces.
Input:
a b b a
d c c d
d c c d
a b b a
Output:
true
*/
import java.util.*;
public class OwlMatrix{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 4x4 matrix");
		char matrix[][] = new char[4][4];
		for (int i=0;i<4 ;i++ ) {
			for (int j=0;j<4 ;j++ ) {
				matrix[i][j] = in.next().charAt(0);
			}
		}
		if ((((matrix[0][0]==matrix[0][3])&&(matrix[0][1]==matrix[0][2]))&&((matrix[1][0]==matrix[1][3])
			&&(matrix[1][1]==matrix[1][2])))&&(matrix[2][0]==matrix[1][0])&&(matrix[2][1]==matrix[1][2])&&
			(((matrix[2][2]==matrix[1][2])&&(matrix[2][3]==matrix[1][3])))&&(matrix[3][0]==matrix[0][0])&&
			((matrix[3][1]==matrix[0][1])&&(matrix[3][2]==matrix[0][2])&&(matrix[3][3]==matrix[0][3]))) {
			System.out.println("Matrix is an Owl Matrix");
		}else{
			System.out.println("Matrix is not an Owl Matrix");
		}
	}
}