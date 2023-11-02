package studio7;

public class Die{
	private int sides;
	
	Die(int sides){
		this.sides = sides;
	}
	
	public int thrown() {
		return (int) (Math.random() * sides + 1);
	}
	
	public String toString() {
		return "Die{sides = " + sides + "}";
	}
	
}