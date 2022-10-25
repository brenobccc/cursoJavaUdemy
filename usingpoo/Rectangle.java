package usingpoo;

public class Rectangle {
	private double width;
	private double height;
	
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2*(width+height);
	}
	
	public double diagonal() {
		return 0.00;
	}
	
	public void setWidth(double wd) {
		this.width = wd;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setHeight(double wd) {
		this.height = wd;
	}
	
	public double getHeight() {
		return this.height;
	}
	
}
