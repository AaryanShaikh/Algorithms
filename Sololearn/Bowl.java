import java.util.*;
class Bowling{
	HashMap<String, Integer> players;
	Bowling(){
		players = new HashMap<String, Integer>();
	}
	void addPlayer(String name,int points){
		players.put(name,points);
	}
	void getWinner(){
		int max = Integer.MIN_VALUE;
		String res = "";
		for (Map.Entry mapElement : players.entrySet()) { 
            if ((int)mapElement.getValue()>max) {
            	max = (int)mapElement.getValue();
            	res = (String)mapElement.getKey();
            }  
        }
        System.out.println(res); 
	}
}
public class Bowl{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Bowling game = new Bowling();
		for (int i=0;i<3 ;i++ ) {
			String strsplit[] = in.nextLine().split(" ");
			game.addPlayer(strsplit[0],Integer.parseInt(strsplit[1]));
		}
		game.getWinner();
	}
}