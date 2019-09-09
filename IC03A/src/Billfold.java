
public class Billfold extends Card
{
    public Card card1;
    public Card card2;
    
    public Billfold(Card card1, Card card2)
    {
        super();
        this.card1 = card1;
        this.card2 = card2;
    }
    
    public void addCard(Card c) {
        
    }
    
    public String format()
    {
       return"Billfold [" + card1.format() + "][" + card2.format() + "]";
    }
    
}
