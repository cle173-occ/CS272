
public class BillFoldTester
{

    public static void main(String[] args)
    {
        DriverLicense d = new DriverLicense("John Doe", 2007);
        CallingCard c = new CallingCard("Omega Card", "30123333", "1234");
        
        Billfold b = new Billfold();
               
        b.addCard(c);
        b.addCard(d);
        
        System.out.println(b.format());
    }

}
