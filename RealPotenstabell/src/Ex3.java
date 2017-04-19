/**
 * Created by Anton on 19.04.2017.
 */
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String args[]){
        int interval_start = 0;
        int interval_end = 10;

        JTextArea text = new JTextArea();

        text.setText("Tall\tAndrepotens\tTredjepotens\n");

        for(int i = interval_start; i <= interval_end; i++){
            text.append(i + "\t" + i*i + "\t" + i*i*i + "\n");
        }

        JOptionPane.showMessageDialog(null, text, "Table", JOptionPane.INFORMATION_MESSAGE);
    }
}
