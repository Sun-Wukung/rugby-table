package tabulka;

import java.util.ArrayList;
import java.util.Collections;



public class Table {
	
	public static void main(String[] args){
		
//		firstly I need to initialize all the teams
		Team rkb = new Team();
	    Team tt = new Team();
	    Team za = new Team();
	    Team sba = new Team();
	    Team pn = new Team();
	    

//	    teams get a name - memo: change this later to do it right at initialization

	    
	    rkb.setName("RKB");
	    tt.setName("TT");
	    za.setName("ZA");
	    sba.setName("SBA");
	    pn.setName("PN");
	    
//	    creating an ArrayList of teams, so we can sort and order them later 
	    
	    ArrayList<Team> arrteam = new ArrayList<Team>();
	    
//	    adding teams 
	    
	    arrteam.add(rkb);
	    arrteam.add(tt);
	    arrteam.add(za);
	    arrteam.add(sba);
	    arrteam.add(pn);
	    
//	    initialize matches
	    
	    Match match1 = new Match();
	    Match match2 = new Match();
	    Match match3 = new Match();
	    Match match4 = new Match();
	    Match match5 = new Match();
	    Match match6 = new Match();
	    Match match7 = new Match();
	    Match match8 = new Match();
	    Match match9 = new Match();
	    Match match10 = new Match();
	    
	    
//	    adding results in format (team1, team2, score home, score away, points home, points away)
//	    find a more elegant way to deal with bonus points system

	    match1.setMatch(tt, pn, 47, 7, 4, 0);
	    match2.setMatch(rkb, za, 12, 5, 4, 0);
	    match3.setMatch(tt, sba, 7, 7, 2, 2);
	    match4.setMatch(za, pn, 7, 44, 0, 4);
	    match5.setMatch(rkb, sba, 10, 14, 0, 4);
	    match6.setMatch(tt, za, 44, 0, 4, 0);
	    match7.setMatch(sba, pn, 41, 0, 4, 0);
	    match8.setMatch(tt, rkb, 44, 5, 4, 0);
	    match9.setMatch(sba, za, 33, 0, 4, 0);
	    match10.setMatch(rkb, pn, 43 ,14, 4, 0);
	    


    
	    
//	    stackoverflow.com/questions/2784514
//	    orders the team by points
//	    the order of o1 and o2 in compare method decides if its ascending or descending

	    
	    Collections.sort(arrteam, (o1, o2) -> Integer.compare(o2.getPoints(), o1.getPoints()));
	    
	    
	    for (int i=0; i<arrteam.size(); i++) {
    		System.out.print(arrteam.get(i).teamname + " " + arrteam.get(i).matches + " " + arrteam.get(i).wins + " " + arrteam.get(i).draws + " " + arrteam.get(i).loses + " " + arrteam.get(i).scorefor + " " + arrteam.get(i).scoreagainst + " " + arrteam.get(i).points + "\n");
    	}

	    
	    }

//	 tuto funkciu by som potreboval, ak by som si chcel vytiahnut len jeden tim
//	    public static void getTblRow(Team team) {
//	        System.out.println(team.teamname + " " + team.matches + " " + team.wins + " " + team.draws + " " + team.loses + " " + team.scorefor + " " + team.scoreagainst + " " + team.points);
//	    }
	    
	    	
	    
	    
	    
 }




