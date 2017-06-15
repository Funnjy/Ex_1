/**
 * Created by Anton Ilchenko on 16.06.2017.
 */
public class Ex2Heltallsliste {

    private Ex2Node first;

    public Ex2Heltallsliste(){
        first = null;
    }

    public Ex2Node find(int n){
        Ex2Node runner = first;
        while (first != null){

            if(first.getInfo() == n){
                return first;
            }else{
                runner = runner.neste;
            }
        }
        return null;
    }

    public boolean remove(int n){
        Ex2Node remove = find(n);

    }
}
