package studio7;

import java.util.*;

public class Rectangle {
	private int length;
	private int width;

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	public int perimeter() {
		return 2 * length + 2 * width;
	}
	
	public boolean smaller(Rectangle other) {
		if(other.length * other.width > width * length) {
			return true;
		}
		return false;
	}
	
	public boolean square() {
		if(length == width) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Rectangle{length = " + length + ", width = " + width + "}";
	}
}

