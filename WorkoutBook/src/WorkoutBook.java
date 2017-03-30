import javax.swing.*;

/**
 * Created by Anton Ilchenko on 30.03.2017.
 */
public class WorkoutBook {
    private String musclegroup;

    public WorkoutBook(String m){
        musclegroup = m;
    }

    public void set_group(String group){
        musclegroup = group;
    }

    public String get_group(){
        return musclegroup;
    }

    public void visGroup(){
        JOptionPane.showMessageDialog(null, "Muscle group is " + musclegroup);
    }
}
