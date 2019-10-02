
public class Square {
	
	private double width;
	private double area;
	
	public Square(){
		width = 0;
		area = 0;
	}
	
	public Square(double width) {
		this.width = width;
		this.area = area;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getArea() {
		area = width * width;
		return area;
	}
	
	public String toString(){
		return "A square with width " + width + " has an area of " + area;
	}
}
