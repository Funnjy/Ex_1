/**
 * Created by Anton Ilchenko on 29.03.2017.
 */
import javax.swing.JOptionPane;
public class Dialogboks {
    public static void main(String[] args){
        exercise_1();
    }

    public static void exercise_1(){
        int number = 0;
        int number2 = 0;
        String numberstring;
        numberstring = JOptionPane.showInputDialog("Print number 1");
        number = Integer.parseInt(numberstring);
        numberstring = JOptionPane.showInputDialog("Print number 1");
        number2 = Integer.parseInt(numberstring);
        JOptionPane.showMessageDialog(null, number+number2);
    }
}
