/**
 * This program experiments with the String hashing function
 * and distributes 5757 5-letter words into 5749 buckets.
 * Stats are collected and displayed.
 * 
 * @author your name here
 * @version date here
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashRunner
{
    public static final int SIZE = 5749;
    public static void main(String[] args)
    {

        int[] x = new int[SIZE];

        try
        {
            File words = new File("sgb-words.txt");
            Scanner in = new Scanner(words);

            // TODO: Complete program . . .
            int word = 0;
            
            while(in.hasNext()) {
                String y = in.next();
                word++;
                
                int hash = y.hashCode();
                if(hash < 0) { hash = -hash; }
                System.out.println(hash);
                hash = hash % SIZE;
                x[hash] = x[hash] + 1;
                
            }
            in.close(); 
            
            int empty = 0;
            int notEmpty = 0;
            int max = 0;
            int chain = 0;
            
            for(int i = 0; i < SIZE; i++) {
                if(x[i] == 0) {empty++;}
                else {
                    notEmpty++;
                    chain += x[i];
                }
                if(max < x[i]) {max = x[i];}
            }
            
            System.out.println("The number of empty buckets is " + empty);
            System.out.println("The longest chain in a bucket is " + chain);
            System.out.println("The average length of a chain is " + (double)chain/notEmpty);  
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
    }
}
