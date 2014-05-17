
public class Game {
	private Team 		team1 			= null;
	private Team 		team2 			= null;
	private int 		score_team1 	= 0;
	private int 		score_team2 	= 0;
	private boolean		finished		= false;
	
	public Game(Team team1, Team team2){
		this.team1 = team1;
		this.team2 = team2;
	}
	
	public void setFinished(boolean finished){
		this.finished = finished;
	}
	
	public boolean isFinished(){
		return this.finished;
	}
}
