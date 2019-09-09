
public class CallingCard extends Card
{
    private int cardNumber;
    private int pin;
    
    public CallingCard(String n, int num, int pin)
    {  
       super(n);
       cardNumber = num;
       pin = pin;
    }
    
    public String format()
    {
       return super.format() + " Card Number: " + cardNumber + " Pin: " + pin;
    }
}
