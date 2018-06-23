package tabulka;

public class Team {
	
	String teamname;
    int matches = 0;
    int wins = 0;
    int draws = 0;
    int loses = 0;
    int scorefor = 0;
    int scoreagainst = 0;
    int scoredif = 0;
    int points = 0;
    
    

    public void setName(String teamname){
         this.teamname = teamname;
    }

    public String getName(){
        return teamname;
    }
    
    public int getPoints() {
    	return points;
    }
    
    

    
}
