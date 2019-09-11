
public class CallingCard extends Card
{
    private String cardNumber;
    private String pinNum;
    
    public CallingCard(String n, String num, String pin)
    {  
       super(n);
       cardNumber = num;
       pinNum = pin;
    }
    
    public String format()
    {
       return super.format() + " Card Number: " + cardNumber + " Pin: " + pinNum;
    }
}
