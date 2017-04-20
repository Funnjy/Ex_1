import javax.swing.*;

/**
 * Created by Anton on 20.04.2017.
 */
public class Meteorologi {
    public static void main(String args[]){

        //Variables definition
        String numString, mnd;
        int år, antallDager, min, maks, n;
        int[] miTemp, maTemp, nedb;
        boolean boo = true;

        //TEST ONLY
        JOptionPane.showMessageDialog(null, ""+ okDato(29,2,2000));

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

    //
    public static String månedsnavn(int mnd){

    }
}
