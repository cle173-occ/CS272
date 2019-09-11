
public class Billfold extends Card
{
    public Card card1;
    public Card card2;
    
    public Billfold() {
        super();
    }
    
    public Billfold(Card card1, Card card2)
    {        
        this.card1 = card1;
        this.card2 = card2;
    }
    
    public void addCard(Card c) {
        if(card1 == null) {
            card1 = c;
        }else if(card2 == null) {
            card2 = c;
        }
    }
    
    public String format()
    {
       return"Billfold [" + card1.format() + "][" + card2.format() + "]";
    }
    
}
