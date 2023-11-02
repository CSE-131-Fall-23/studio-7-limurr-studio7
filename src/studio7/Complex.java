package studio7;

public class Complex {
	private double real;
	private double imaginary;
	
	Complex(double real, double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex addition(Complex other) {
		Complex ans = new Complex(real + other.real, imaginary + other.imaginary);
		return ans;
	}
	
	public Complex multiply(Complex other) {
		Complex ans = new Complex(real*other.real - imaginary * other.imaginary, real * other.imaginary + imaginary * other.real);
		return ans;
	}
	
	public String toString() {
		return "Complex{real = " + real + ", imaginary = " + imaginary + "}";
	}
	
	
	
	
}
