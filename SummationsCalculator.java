import java.util.Scanner;
public class SummationsCalculator{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=in.nextInt();
		System.out.println("Enter the last number");
		int num2=in.nextInt();
		System.out.println("Enter the expression");
		char exp=in.next().charAt(0);
		System.out.println("Enter the expression number");
		int exp_num=in.nextInt();
		int res=0,sum=0;		
		switch(exp){
			case '+':
					for (int i=num1;i<=num2;i++) {
						res=i+exp_num;
						sum+=res;
					}
					System.out.println("The result="+sum);
			break;
			case '-':
      for (int i=num1;i<=num2;i++) { 
						res=i-exp_num;
						sum+=res;
					}
					System.out.println("The result="+sum);
			break;
			case '*':
					for (int i=num1;i<=num2;i++) {
						res=i*exp_num;
						sum+=res;
					}
					System.out.println("The result="+sum);
			break;
			case '/':
					for (int i=num1;i<=num2;i++) {
						res=i/exp_num;
						sum+=res;
					}
					System.out.println("The result="+sum);
			break;
			case '%':
					for (int i=num1;i<=num2;i++) {
						res=i%exp_num;
						sum+=res;
					}
					System.out.println("The result="+sum);
			break;
			default :System.out.println("Wrong expression");
			break;
		}
	}
}