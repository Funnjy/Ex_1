/**
 * Created by Anton Ilchenko on 29.03.2017.
 */
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
public class Dialogboks {
    public static void main(String[] args){
        //exercise_1();
        //exercise_2();
        //exercise_3();
        //exercise_4();
        //exercise_5();
        exercise_6();
    }

    public static void exercise_1(){
        double number = 0;
        double number2 = 0;
        double sum = 0;
        String numberstring;
        numberstring = JOptionPane.showInputDialog("Print number 1");
        number = Double.parseDouble(numberstring);

        numberstring = JOptionPane.showInputDialog("Print number 1");
        number2 = Double.parseDouble(numberstring);

        sum = number+number2;
        JOptionPane.showMessageDialog(null, "Sum av " + number+" og "+number2+" = "+sum);
    }

    public static void exercise_2(){
        double n1 = 0;
        double n2 = 0;
        double sum = 0;
        double produkt = 0;
        double modul = 0;

        String nString;

        nString = JOptionPane.showInputDialog("Skriv nummer 1");
        n1 = Double.parseDouble(nString);

        nString = JOptionPane.showInputDialog("Skriv nummer 2");
        n2 = Double.parseDouble(nString);

        sum = n1+n2;
        produkt = n1*n2;
        modul = n1%n2;

        JOptionPane.showMessageDialog(null, "Sum: " + sum
                                                                    + " \nProdukt " + produkt
                                                                    + "\nModul " + modul);
    }

    public static void exercise_3(){
        String name;
        int year = 0;
        String intString;
        int years = 0;

        name = JOptionPane.showInputDialog("Skriv inn navn");
        intString = JOptionPane.showInputDialog("Skriv inn fødselsdato");

        year = Integer.parseInt(intString);
        years = 2017 - year;
        JOptionPane.showMessageDialog(null, name + ", du blir "+years);
    }
    public static void exercise_4(){
        String intString;
        int sek = 0;

        intString = JOptionPane.showInputDialog("Skriv in antall sekunder du lurer på");
        sek = Integer.parseInt(intString);

        JOptionPane.showMessageDialog(null, sek + " sekunder er lik "+ sek/60);
    }
    public static void exercise_5(){
        String intString;
        int sek = 0;
        int h = 0;
        int m = 0;

        intString = JOptionPane.showInputDialog("Skriv in antall sekunder du lurer på");
        sek = Integer.parseInt(intString);

        m = sek/60;
        h = m/60;
        m = m%60;
        h = h%60;

        JOptionPane.showMessageDialog(null, sek + " sekunder er lik "+ sek%60
                + "  sekunder " + m +" minuter og "+ h +" timer ");
    }
    public static void exercise_6(){
        int i = 0;
        String intString;
        boolean n = true;
        String resultat;

        while(n == true){
            intString = JOptionPane.showInputDialog("Skriv in helltall");
            i = Integer.parseInt(intString);
            if(i%3 == 0 ){
                resultat = "er delig på 3";
            }
            else{
                resultat = "er ikke delig på 3";
            }
            JOptionPane.showMessageDialog(null, "Tall "+ i +" " + resultat);
        }
    }
}
