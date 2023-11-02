package studio7;

public class HockeyPlayer {
	private String name;
	private int number;
	private String shoot;
	private int goals;
	private int assists;
	private int games;
	private int points;
	
	HockeyPlayer(String name, int number, String shoot){
		this.name = name;
		this.number = number;
		this.shoot = shoot;
		this.assists = 0;
		this.goals = 0;
		this.games = 0;
		points = assists + goals;
	}
	
	public void gameComplete(int goals, int assists) {
		System.out.println("we won!!!");
		this.goals += goals;
		this.assists += assists;
		games ++;
		
	}
	
	public String toString() {
		return "Complex{name = " + name + ", number = " + number 
				+ ", shoot = " + shoot + ", goals = " + goals + ", assists = " + assists + 
				", points = " + points + ", games = " + games +"}";
	}
	
	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	public void setGames(int games) {
		this.games = games;
	}
	
	public void setAssists(int assists) {
		this.assists = assists;
	}
	
}
