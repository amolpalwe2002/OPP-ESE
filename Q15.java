import java.util.ArrayList;
import java.util.Iterator;

public class Q15 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("############");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("############");
        for(Integer e: list){
            System.out.println(e);
        }
    }
    
}
