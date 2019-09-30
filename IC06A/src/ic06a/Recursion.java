package ic06a;

public class Recursion
{
    
    
    public static void reverse(String x) {     
         
        if(x.length() <= 0) {
            System.out.println(x);
        }
        else {
            System.out.print(x.charAt(x.length() - 1));    
            reverse(x.substring(0, x.length() - 1));
        }            
    }
    
    
    public static void main(String args[]) {
        reverse("Hello!");
        System.out.println();
        
        reverse("Orange Coast College");
        System.out.println();
        
        reverse("go");
        System.out.println();
        
        reverse("x");
    }
}
