import java.util.Arrays;

/**
   This program demonstrates the selection sort algorithm by
   sorting an array that is filled with random numbers.
 */
public class SelectionSortCountDemo
{  
    public static void main(String[] args)
    {  
        int[] a = ArrayUtil.randomIntArray(10000, 100);
        //System.out.println(Arrays.toString(a));

        SelectionSorter.sort(a);
        //System.out.println(Arrays.toString(a));
        System.out.println("10000 Values: " + SelectionSorter.count);
        
        int[] b = ArrayUtil.randomIntArray(20000, 100);
        //System.out.println(Arrays.toString(b));

        SelectionSorter.sort(b);
        //System.out.println(Arrays.toString(b));
        System.out.println("20000 Values: " + SelectionSorter.count);

        int[] c = ArrayUtil.randomIntArray(30000, 100);
        //System.out.println(Arrays.toString(c));

        SelectionSorter.sort(c);
        //System.out.println(Arrays.toString(c));
        System.out.println("30000 Values: " + SelectionSorter.count);
        
        int[] d = ArrayUtil.randomIntArray(40000, 100);
        //System.out.println(Arrays.toString(d));

        SelectionSorter.sort(d);
        //System.out.println(Arrays.toString(d));
        System.out.println("40000 Values: " + SelectionSorter.count);
        
        int[] e = ArrayUtil.randomIntArray(50000, 100);
        //System.out.println(Arrays.toString(e));

        SelectionSorter.sort(e);
        //System.out.println(Arrays.toString(e));
        System.out.println("50000 Values: " + SelectionSorter.count);
        
        int[] f = ArrayUtil.randomIntArray(30000, 100);
        //System.out.println(Arrays.toString(f));

        SelectionSorter.sort(f);
        //System.out.println(Arrays.toString(f));
        System.out.println("60000 Values: " + SelectionSorter.count);
        
        int[] g = ArrayUtil.randomIntArray(30000, 100);
        //System.out.println(Arrays.toString(g));

        SelectionSorter.sort(g);
        //System.out.println(Arrays.toString(g));
        System.out.println("70000 Values: " + SelectionSorter.count);
        
        int[] h = ArrayUtil.randomIntArray(30000, 100);
        //System.out.println(Arrays.toString(h));

        SelectionSorter.sort(h);
        //System.out.println(Arrays.toString(h));
        System.out.println("80000 Values: " + SelectionSorter.count);
        
        int[] i = ArrayUtil.randomIntArray(30000, 100);
        //System.out.println(Arrays.toString(i));

        SelectionSorter.sort(i);
        //System.out.println(Arrays.toString(i));
        System.out.println("90000 Values: " + SelectionSorter.count);
    }
}


