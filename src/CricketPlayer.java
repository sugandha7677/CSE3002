
public class CricketPlayer {

	public static void main(String[] args) {
 
		Captain c=new Captain();
		c.SetWon(5);
		

	}
	
	
	
	private static String name;
	public int highestscore;
	
	
	String getName() {
		return name;
	}

	int getHighestScore() {
		return highestscore;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setHighestScore(int score) {
		this.highestscore=score;
	}
//	
//	CricketPlayer(String n,int a){
//		name=n;
//		highestscore=a;
//	}
	
	void ScoreCard() {
		System.out.println("Name: "+name +" Score: "+highestscore);
	}
}

class Captain extends CricketPlayer{
	
	public int no_of_matches_won;
	
	int getno_of_mw() {
		return no_of_matches_won;
	}
	
	void SetWon(int m) {
		no_of_matches_won=m;
	}
}
