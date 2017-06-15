/**
 * Created by Anton Ilchenko on 16.06.2017.
 */
public class Ex2Node {

    private int info;
    Ex2Node neste;

    public Node(int data){
        info = data;
        neste = null;
    }

    public int getInfo(){return info;}
    public void setInfo(int newValue){info = newValue;}
}
