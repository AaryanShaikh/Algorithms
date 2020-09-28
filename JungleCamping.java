import java.util.Scanner;
public class JungleCamping{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String voices = in.nextLine();
		voices = voices.toLowerCase(); 
		String words[] = voices.split("\\s+");
		String output[] = new String[50];
		for (int i=0; i<words.length; i++) {
		 	switch (words[i]) {
		 		case "grr": output[i]="Lion";
		 					break;
		 		case "rawr": output[i]="Tiger";
		 					break;
		 		case "ssss": output[i]="Snake";
		 					break;
		 		case "chirp": output[i]="Bird";
		 					break;
		 		default: break; 
		 	}
		 }
		 for (int i=0; i<output.length;i++ ) {
		  		if (output[i]!=null) {
		  			System.out.print(output[i]+" ");
		  		}
		  } 
	}
}