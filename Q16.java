import java.util.HashMap;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");

        for(String e: words){
            Integer count = map.get(e);
            if(count == null){
                map.put(e, 1);
            }else{
                map.put(e, count+1);
            }
        }

        System.out.println(map);
        sc.close();
    }
    
}
