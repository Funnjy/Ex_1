/**
 * Created by Anton on 03.04.2017.
 */
public class Konto {
    //<  Datafeltene for kontoinnehavers navn, kontornummer og saldo. >
    String name;
    int k_number, saldo;

    //<  Kontruktør som skal gi startverdier til ALLE datafeltene  >
    public Konto(String n, int k, int s){
        name = n;
        k_number = k;
        saldo = s;
    }

    //<  set-metode for kontoinnehaverens navn >
    public void set_name(String n){
        name = n;
    }
    public String get_name(){
        return name;
    }
    //<  get-metode for kontoinnehaverens navn, kontonummer og saldo  >
    public void set_k_number(int k){
        k_number = k;
    }
    public int get_k_number(){
        return k_number;
    }
    public void set_saldo(int s){
        saldo = s;
    }
    public int get_saldo(){
        return saldo;
    }

    //<  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
    public void konto_out(){

    }
    //navn, kontonummer og saldo i et dialogvindu. >

    //<  Metode som setter inn et beløp på kontoen.
    //Beløpets størrelse skal tas imot via en parameter til metoden.
    //Metoden skal returnere en tekst som inneholder informasjon om
    //den nye saldoen.  >

    //<  Metode som tar ut et beløp fra kontoen, under forutsetning av
    //at det er dekning for beløpet.
    //        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
    //Hvis det er dekning på kontoen, skal metoden returnere en tekst
    //med informasjon om den nye saldoen. Hvis  det ikke er dekning,
    //skal den returnerte teksten inneholde informasjon om det. >

}
