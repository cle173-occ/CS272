
public class Rectangle {
	
	private double height;
	private double width;
	private double area;
	
	public Rectangle(){
		height = 0;
		width = 0;
		area = 0;
	}
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
		this.area = area;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		area = height * width;
		return area;		
	}
	
	public String toString() {
		return "A rectangle with height " + height + " and width " + width +  " has an area of " + area;
	}
}
