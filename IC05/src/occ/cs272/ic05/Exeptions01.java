package occ.cs272.ic05;

import java.util.Scanner;

/** CS 272 - Exceptions example 1
*
*  Put the array code in a try block and
*  catches the array index out of bounds exception
*  if it occurs.
*
*/

public class Exeptions01
{
    public static void main(String [] args)
    {
        try (Scanner cin = new Scanner(System.in))
        {
            boolean ok = false;
            while (!ok)
            {
                
                System.out.println("int[] a = {5, 6, 7};");
                System.out.print("What element do you want? ");
                int[] ar =
                { 5, 6, 7 };
                try
                {
                    ok = true;
                    String indexStr = cin.next();
                    int index = Integer.parseInt(indexStr);
                    //int index = System.in.read();

                    int value = ar[index];
                    System.out.printf("ar[%d] = %d%n", index, value);
                }

                catch (Exception e)
                {
                    if (e instanceof NumberFormatException)
                    {
                        System.err.println("Please use an integer input");
                    }

                    else if (e instanceof ArrayIndexOutOfBoundsException)
                    {
                        System.err.println("Please use an index between 0 and " + (ar.length - 1));
                    } else
                        System.err.println("Error!");
                        System.err.print(e.getMessage());
                        e.printStackTrace();
                    ok = false;
                } 
            }
        }
    }
}
