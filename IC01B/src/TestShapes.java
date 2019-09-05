/*
 * CS 272 -In Class Java Review  01B
 * Tests the Circle, Rectangle, and Square classes and gets their areas
 * Also creates an array filled with random 
 * 
 * @author Chris Le
 * @version 2019-09-04
 */

import java.util.Random;

public class TestShapes {

	public static void main(String[] args) {
		
		Circle cir = new Circle(2.0);
		cir.getArea();
		System.out.println(cir.toString());
			
		Rectangle rec = new Rectangle(2.0,3.0);
		rec.getArea();
		System.out.println(rec.toString());
		
		Square sqr = new Square(2.0);
		sqr.getArea();
		System.out.println(sqr.toString());
		
		double arr[] = new double[100];
		double sum = 0;
		double highest = 0;
		double lowest = 100;
		
		Random rand = new Random();
		
		
		for(int i = 0; i < arr.length; i++) {
			double radius = rand.nextInt(100);
			Circle cir1 = new Circle(radius);
			arr[i] = cir1.getArea();
			
			sum += arr[i];
			
			if(arr[i] > highest) {
				highest = arr[i];
			}
			
			if(arr[i] < lowest){
				lowest = arr[i];
			}
		}
		
		System.out.println("Array Area Sum: " + sum);
		System.out.println("Highest number in Array: " + highest);
		System.out.println("Lowest number in Array: " + lowest);
	}

}
