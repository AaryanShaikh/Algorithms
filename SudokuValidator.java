/* create an algorithm that checks any solved sudoku's validity and show where the repetition is
happening.
input:
3 5 2 9 1 8 6 7 4
8 9 7 2 4 6 5 1 3
6 4 1 7 5 3 2 8 9
7 8 3 5 6 9 4 2 1
9 2 6 1 3 4 7 5 8
4 1 5 8 2 7 9 3 6
8 6 4 3 7 5 8 9 2
2 7 8 4 9 1 3 6 5
5 3 9 6 8 2 1 4 7
output:
[7,7] = 8 is repeated
[7,1] = 8 is repeated
false
input:
3 5 2 9 1 8 6 7 4
8 9 7 2 4 6 5 1 3
6 4 1 7 5 3 2 8 9
7 8 3 5 6 9 4 2 1
9 2 6 1 3 4 7 5 8
4 1 5 8 2 7 9 3 6
1 6 4 3 7 5 8 9 2
2 7 8 4 9 1 3 6 5
5 3 9 6 8 2 1 4 7
output:
true
*/
import java.util.*;
public class SudokuValidator{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sudoku[][] = new int[9][9];
		for (int i=0;i<9 ;i++ ) {
			for (int j=0;j<9 ;j++ ) {
				sudoku[i][j] = in.nextInt();
			}		
		}
		boolean check = true;
		/*Column wise checking*/
		String res = "";
		for (int i=0;i<9 ;i++ ) {
			for (int j=0;j<9 ;j++ ) {
				if(res.contains(Integer.toString(sudoku[i][j]))){
					System.out.println("["+(i+1)+","+(j+1)+"] = "+sudoku[i][j]+" is repeated");
					check = false;	
				}else{
					res+=Integer.toString(sudoku[i][j]);
				}
			}
			res = "";
		}
		res = "";
		/*Row wise checking*/
		for (int i=0;i<9 ;i++ ) {
			for (int j=0;j<9 ;j++ ) {
				if(res.contains(Integer.toString(sudoku[j][i]))){
					System.out.println("["+(j+1)+","+(i+1)+"] = "+sudoku[j][i]+" is repeated");
					check = false;	
				}else{
					res+=Integer.toString(sudoku[j][i]);
				}
			}
			res = "";
		}
		if (check) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
}