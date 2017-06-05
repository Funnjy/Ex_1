/**
 * Created by Anton Ilchenko on 04.06.2017.
 */
public class Coffe {
    private String tittel;
    Coffe neste;

    public Coffe( String nyTittel )
    {
        tittel = nyTittel;
        neste = null;
    }

    public String toString()
    {
        return tittel;
    }
}
