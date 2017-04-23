import javax.swing.*;

/**
 * Created by Anton on 20.04.2017.
 */
public class Meteorologi {

    enum Måneder {JANUAR, FEBRUAR, MARS, APRIL, MAI, JUNI, JULI, AUGUST, SEPTEMBER, OKTOBER, NOVEMBER, DESEMBER, UKJENTMÅNED};

    public static void main(String[] args{

        //Variables definition
        String numString, mnd;
        int år, antallDager, min, maks, n;
        int[] miTemp, maTemp, nedb;
        boolean boo = true;

        //TEST ONLY
        JOptionPane.showMessageDialog(null, " "+ date_format(JOptionPane.showInputDialog(null, "Skriv dato (dd.mm.åååå): ")));

        //User input: mnd name, år
        mnd = JOptionPane.showInputDialog(null, "Les inn månedens navn");
        numString = JOptionPane.showInputDialog(null, "Les inn nåværende år");

        //String to int convert
        år = Integer.parseInt(numString);

        //User input: number of days
        numString = JOptionPane.showInputDialog(null, "Les inn antall dager i måned");

        //String to int convert
        antallDager = Integer.parseInt(numString);

        miTemp = new int[antallDager];
        maTemp = new int[antallDager];
        nedb = new int[antallDager];

        int wInt = 0;
        while(wInt < antallDager){

            //User input: min temp, maks temp, nedbør
            numString = JOptionPane.showInputDialog(null, "Les inn minimum temperatur for dag " + (wInt+1));
            min = Integer.parseInt(numString);
            numString = JOptionPane.showInputDialog(null, "Les inn maksimum temperatur for dag " + (wInt+1));
            maks = Integer.parseInt(numString);
            numString = JOptionPane.showInputDialog(null, "Les inn nedbør for dag " + (wInt+1));
            n = Integer.parseInt(numString);

            //Check parameters
            if(min > maks){
                JOptionPane.showMessageDialog(null, "Minimum temperatur kan ikke være større en maksimum");
                boo = false;
            }
            else if(min < -40 || min > 50 || maks < -40 || maks > 50){
                JOptionPane.showMessageDialog(null, "Min/maks temperature range er invalid");
                boo = false;
            }
            else if(n < 0 || n > 40){
                JOptionPane.showMessageDialog(null, "Nedbær er invalid range");
                boo = false;
            }

            if(boo){
                miTemp[wInt] = min;
                maTemp[wInt] = maks;
                nedb[wInt] = n;
                wInt++;
            }
        }

        //Create Statistikk obj
        Statistikk myStatistikk = new Statistikk(mnd, år, miTemp, maTemp, nedb);

        //Text boxt
        JTextArea resutltat = new JTextArea();

        //Fill textbox with information
        myStatistikk.værStatistikk(resutltat);

        //Show resultat
        JOptionPane.showMessageDialog(null, resutltat, "Statistikk", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, myStatistikk.maksTempVariasjonDager());

    }
    //Check if year is leap year
    public static boolean skuddår(int årstall){
        if (årstall%4 == 0  && årstall%400 == 0){
            return true;
        }
        else
            return false;
    }

    //Return amount of days in given month based on which year user give
    public static int månedsdager(int måned, int år){
        if(måned < 1 || måned > 12){
            JOptionPane.showMessageDialog(null, "Parameter måned kan ikke vare mindre enn 1 eller større en 12");
            return -1;
        }
        if(måned == 2){
            if (skuddår(år) == false){
                return 28;
            }
            else if(skuddår(år) == true){
                return 29;
            }
        }
        if(måned%2 == 0){
            return 30;
        }
        else return 31;
    }

    //Return true if given date is valid based on month and year
    public static boolean okDato(int dag, int mnd, int år){
        if (dag > 1 && dag <= månedsdager(mnd, år)){
            return true;
        }
        return false;
    }

    //Return manth name based on user input. Returns *ukjent måned" if input is invalid
    public static Måneder månedsnavn(int mnd){
        Måneder januar, februar, mars, april, mai, juni, juli, august, september, oktober, november, desember, ukjent;

        //Declare month
        januar = Måneder.JANUAR; februar = Måneder.FEBRUAR; mars = Måneder.MARS;
        april = Måneder.APRIL; mai = Måneder.MAI; juni = Måneder.JUNI;
        juli = Måneder.JULI; august = Måneder.AUGUST; september = Måneder.SEPTEMBER;
        oktober = Måneder.OKTOBER; november = Måneder.NOVEMBER; desember = Måneder.DESEMBER;
        ukjent = Måneder.UKJENTMÅNED;

        Måneder[] måned_array = new Måneder[]{januar,februar,mars,april,mai,juni,juli,august,september,oktober,november,desember, ukjent};

        if(mnd > 12 ||  mnd < 1){
            return måned_array[måned_array.length-1];
        }
        return måned_array[mnd];
    }

    //Take STRING and convert it to numbers. Then make answer
    public static int date_format(String date){

        int dato, mnd, y;

        JOptionPane.showInputDialog("Skriv dato (dd.mm.åååå); ");

        dato = Integer.parseInt(date.substring(0,2));
        if(dato < 1 || dato > 31) {
            JOptionPane.showInputDialog("Dato verdi er ugyldig!");
            return -1;
        }

        mnd = Integer.parseInt(date.substring(3,5));
        if(mnd < 1 || mnd > 12){
            JOptionPane.showInputDialog("Måned verdi er ugyldig!");
            return -1;
        }

        y = Integer.parseInt(date.substring(6));

        JOptionPane.showMessageDialog(null, "" + dato + " " + månedsnavn(mnd)+ " " + y);
        return 1;
    }
}
