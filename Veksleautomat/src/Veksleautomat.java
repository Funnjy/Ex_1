import javax.swing.*;

/**
 * Created by Anton on 03.04.2017.
 */
public class Veksleautomat {
    private int max;
    private int f_lapp, t_lapp, e_lapp;
    private int belop;

    public Veksleautomat(){
        max = 100;
        f_lapp = 0;
        t_lapp = 0;
        e_lapp = 0;
        belop = 0;
    }

    public void calc_ny_max(int n){ //Calculer max after payd belop
        if(max-n >= 0)
            max -= n;
        else JOptionPane.showMessageDialog(null, "Beløp må være mindre enn 100!");
    }

    public void veksling_resultat(){
        f_lapp = max/50;
        max = max%50;
        t_lapp = max/20;
        max = max%20;
        e_lapp = max/1;
    }

    public void resultat(){
        JOptionPane.showMessageDialog(null, "Tilbake:\n" +
                f_lapp + " 50-lapp\n" +
                t_lapp + " 20-lapp\n" +
                e_lapp + " 1-lapp");
    }
}
