package entities;

public class Retangulo {
	private double width;
	private double height;
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		double area; 
		area = this.width * this.height;
		return area;
	}
	
	public double perimeter() {
		double perimeter;
		perimeter = (2 * this.width) + (2 * this.height);
		return perimeter;		
	}
	
	public double diagonal() {
		double diagonal;
		diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return diagonal;
	}
}
