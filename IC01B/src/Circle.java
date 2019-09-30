
public class Circle {
	
	private double radius;
	private double area;
	
	public Circle() {
		radius = 0;
		area = 0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public String toString() {
		
		return "A circle with radius " + radius + " has an area of: " + area;
	}
	
}
