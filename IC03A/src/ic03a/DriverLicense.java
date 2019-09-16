package ic03a;
public class DriverLicense extends Card
{
    private int expirationYear;
    
    public DriverLicense(String n, int exp) {
        
        super(n);
        expirationYear = exp;
    }
    
    public String format()
    {
       return super.format() + " Expiration Year: " + expirationYear; 
    }
}
