/*
 * 
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
			arr[i] = rand.nextInt(100);
			sum += arr[i];
			
			if(arr[i] > highest) {
				highest = arr[i];
			}
			
			if(arr[i] < lowest){
				lowest = arr[i];
			}
		}
		
		System.out.println("Array Sum: " + sum);
		System.out.println("Highest number in Array: " + highest);
		System.out.println("Lowest number in Array: " + lowest);
	}

}
