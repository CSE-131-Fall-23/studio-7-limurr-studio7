package studio7;

public class HockeyPlayer {
	private String name;
	private int number;
	private String shoot;
	private int goals;
	private int assists;
	private int games;
	private int points;
	
	HockeyPlayer(String name, int number, String shoot, int goals, int assists, int games){
		this.name = name;
		this.number = number;
		this.shoot = shoot;
		this.assists = assists;
		this.goals = goals;
		this.games = games;
		points = assists + goals;
	}
	
	public void react() {
		System.out.println("we won!!!");
	}
	
	public String toString() {
		return "Complex{name = " + name + ", number = " + number 
				+ ", shoot = " + shoot + ", goals = " + goals + ", assists = " + assists + 
				", points = " + points + ", games = " + games +"}";
	}
	
}
