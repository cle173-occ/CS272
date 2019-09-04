/*
 * 
 */

import java.util.Random;

public class RandomArray
{

    public static void main(String[] args)
    {
        double arr[] = new double[100];
        Random rand = new Random();
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50)+25;
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
