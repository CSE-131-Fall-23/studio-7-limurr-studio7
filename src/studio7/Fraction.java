package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	Fraction(int d, int den){
		numerator = d;
		denominator = den;
	}
	
	public Fraction addition(Fraction other) {
		int num1 = numerator * other.denominator;
		int num2 = other.numerator * denominator;
		int den = denominator * other.denominator;
		
		Fraction ans = new Fraction(num1 * num2, den);
		
		return ans;
	}
	
	public Fraction multiply(Fraction other) {
		
		Fraction ans = new Fraction(numerator * other.numerator, denominator * other.denominator);
		
		return ans;
	}
	
	public Fraction reciprocal() {
		
		Fraction ans = new Fraction(denominator * -1, numerator);
		
		return ans;
	}
	
	public Fraction simplify() {
		int num = numerator;
		int den = denominator;
		int max = 0;
		if(numerator > denominator) {
			max = numerator;
		}else {
			max = denominator;
		}
		
		for(int i = 2; i < max/2 + 1; i++) {
			boolean cont = true;
			while(cont) {
				if(num % i == 0 && den % 1 == 0) {
					num /= i;
					den /= i;
				}else {
					cont = false;
				}
			}
		}
		
		Fraction ans = new Fraction(num, den);
		
		return ans;
	}
	
	public String toString() {
		return "Fraction{numerator = " + numerator + ", denominator = " + denominator + "}";
	}
	
	

}
