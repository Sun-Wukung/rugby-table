package tabulka;

public class Match {
	
	Team team1;
    Team team2;
    int score1;
    int score2;
    int matchpoint1;
    int matchpoint2;
    

    public void setMatch(Team team1, Team team2, int score1, int score2, int matchpoint1, int matchpoint2){
        
        team1.matches += 1;
        team2.matches += 1;        
        team1.scorefor += score1;
        team1.scoreagainst += score2;
        team2.scorefor += score2;
        team2.scoreagainst += score1;
        team1.points += matchpoint1;
        team2.points += matchpoint2;
        if (score1 > score2) {
        	team1.wins += 1;
        	team2.loses += 1;
        	
        }
        else if (score1 < score2) {
        	team1.loses += 1;
        	team2.wins += 1;
        }
  
        else {
        		team1.draws += 1;
        		team2.draws +=1;
        }
        
    }

    public int getPoints(Team team1){
        return team1.points;
    }

    public String getTeam(Team team1){
        return team1.teamname;
    }
    


}
