/**
 * Created by Anton Ilchenko on 04.06.2017.
 */
public class CoffeList {
    private Coffe først;

    public CoffeList(){
        først = null;
    }

    public void settInn(Coffe ny){
        if(ny == null) return;

        if(først == null) først = ny;

        else{
            Coffe løper = først;
            while (løper.neste != null) løper = løper.neste;

            løper.neste = ny;
        }
    }

    public String toString(){
        String resultat = "";
        Coffe løper = først;

        while (løper != null){
            resultat += løper.toString() + "\n";
            løper = løper.neste;
        }

        if(!resultat.equals("")) return resultat;
        else return "Ingen coffe registrert";
    }
}
