/**
   The sort method of this class sorts an array,
   using the bubble sort algorithm.
 */
public class BubbleSorter
{
    /**
       Sorts an array, using bubble sort.
       @param a the array to sort
     */
    public static long count = 0;
    
    public static void sort(int[] a)
    {
        // TODO: Implement bubble sort

        for(int i = 0; i < a.length; i++) {
            
            for(int j = 0; j < i; j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    count++;
                }     
                
            }
        }
    }
}
