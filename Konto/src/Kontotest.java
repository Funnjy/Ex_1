import javax.swing.*;

/**
 * Created by Anton on 03.04.2017.
 */
public class Kontotest {
    public static void main(String[] args){
        Konto konto_a, konto_b = null;
        String intString;
        int n;

        konto_a = new Konto("Sparekonto", 7548807, 10000);
        konto_b = new Konto("Intro", 41175966, 5000);

        konto_a.konto_out();
        konto_b.konto_out();

        intString = JOptionPane.showInputDialog(null, "Ta ut:");

        n = Integer.parseInt(intString);
        konto_a.fra_konto(n);

        intString = JOptionPane.showInputDialog(null, "Sette inn:");
        n = Integer.parseInt(intString);
        konto_a.til_konto(n);
    }
}
