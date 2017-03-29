/**
 * Created by Anton Ilchenko on 29.03.2017.
 */
import javax.swing.JOptionPane;
public class Dialogboks {
    public static void main(String[] args){
        exercise_1();
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
}
