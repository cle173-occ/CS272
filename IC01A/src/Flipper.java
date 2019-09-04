/*
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Flipper
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many coins should the coin be flipped? ");
        int flips = scan.nextInt();
        
        for(int i = 1; i <= flips; i++) {
            
            if(Math.random() < 0.5) {
                System.out.printf("%-7s", "Heads");
            }
            else {
                System.out.printf("%-7s", "Tails");
            }
            
            if(i%10 == 0) {
                System.out.println();
            }
            
        }

    }

}
