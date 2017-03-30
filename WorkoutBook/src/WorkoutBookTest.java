import javax.swing.*;

/**
 * Created by Anton Ilchenko on 30.03.2017.
 */
public class WorkoutBookTest {
    public static void main(String[]args){
        WorkoutBook book = null;

        String g = JOptionPane.showInputDialog("Type group you are goig to train: ");

        book = new WorkoutBook(g);
        book.visGroup();
    }
}
