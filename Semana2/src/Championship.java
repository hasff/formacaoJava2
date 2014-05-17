
public class Championship {
	private Team[] teams;
	private Game[] games;
	
	public Championship(){
	
	}
	
	public boolean addTeam(Team team){
		boolean result = false;
		
		for (int i = 0; i < teams.length; i++){
			if (teams[i] == null){
				teams[i] = team;
				result = true;
				break;
			}
		}
		
		return 	result;
	}
	
	public Team addTeam(String teamName){
		Team 	result = null;
		
		for (int i = 0; i < teams.length; i++){
			if (!teams[i].getName().equals(teamName)) {
				if (teams[i] == null){
					teams[i] = new Team(teamName);
					result = teams[i];
					break;
				}
			}
			else{
				break;
			}
		}
		
		return 	result;
	}
	
}
