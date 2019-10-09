import java.util.Arrays;

public class BubbleSortDemo
{
    public static void main(String[] args)
    {
        int[] a = ArrayUtil.randomIntArray(10000, 100);
        //System.out.println(Arrays.toString(a));

        BubbleSorter.sort(a);
        //System.out.println(Arrays.toString(a));
        System.out.println("10000 Values: " + BubbleSorter.count);
        
        int[] b = ArrayUtil.randomIntArray(20000, 100);
        //System.out.println(Arrays.toString(b));
 
        BubbleSorter.sort(b);
        //System.out.println(Arrays.toString(b));
        System.out.println("20000 Values: " + BubbleSorter.count);

        int[] c = ArrayUtil.randomIntArray(30000, 100);
        //System.out.println(Arrays.toString(c));

        BubbleSorter.sort(c); 
        //System.out.println(Arrays.toString(c));
        System.out.println("30000 Values: " + BubbleSorter.count);
        
        int[] d = ArrayUtil.randomIntArray(40000, 100); 
        //System.out.println(Arrays.toString(d));

        BubbleSorter.sort(d);
        //System.out.println(Arrays.toString(d));
        System.out.println("40000 Values: " + BubbleSorter.count);
        
        int[] e = ArrayUtil.randomIntArray(50000, 100);
        //System.out.println(Arrays.toString(e));

        BubbleSorter.sort(e);
        //System.out.println(Arrays.toString(e));
        System.out.println("50000 Values: " + BubbleSorter.count);
        
        int[] f = ArrayUtil.randomIntArray(30000, 100);
        //System.out.println(Arrays.toString(f));

        BubbleSorter.sort(f);
        //System.out.println(Arrays.toString(f));
        System.out.println("60000 Values: " + BubbleSorter.count);
        
        int[] g = ArrayUtil.randomIntArray(30000, 100);
        //System.out.println(Arrays.toString(g));

        BubbleSorter.sort(g);
        //System.out.println(Arrays.toString(g));
        System.out.println("70000 Values: " + BubbleSorter.count);
        
        int[] h = ArrayUtil.randomIntArray(30000, 100);
        //System.out.println(Arrays.toString(h));

        BubbleSorter.sort(h);
        //System.out.println(Arrays.toString(h));
        System.out.println("80000 Values: " + BubbleSorter.count);
        
        int[] i = ArrayUtil.randomIntArray(30000, 100);
        //System.out.println(Arrays.toString(i));

        BubbleSorter.sort(i);
        //System.out.println(Arrays.toString(i));
        System.out.println("90000 Values: " + BubbleSorter.count);
    }

}
