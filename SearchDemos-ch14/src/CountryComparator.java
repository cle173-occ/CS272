import java.util.Comparator;

public class CountryComparator implements Comparator<Country>
{

    @Override
    public int compare(Country o1, Country o2)
    {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }
}
