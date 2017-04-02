import javax.swing.*;

/**
 * Created by Anton Ilchenko on 30.03.2017.
 */
public class WorkoutBookTest {
    public static void main(String[]args){

        WorkoutBook book = null, book2 = null;

        String group = JOptionPane.showInputDialog("Type group you are goig to train: ");

        book = new WorkoutBook(group);

        int svar = JOptionPane.showOptionDialog(null,
                "Create new book?","Create new book?", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,null,null);
        if(svar == JOptionPane.YES_OPTION){
            group = JOptionPane.showInputDialog("Write group name:");
            book2 = new WorkoutBook(group);
        }

        String info = "Book created:\n";
        info = info + book.get_group();
        if(book2 != null)
            info = info + "\n" + book2.get_group();

        JOptionPane.showMessageDialog(null,info,"Registred group",JOptionPane.PLAIN_MESSAGE);
        book.visGroup();
    }
}
