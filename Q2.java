import java.util.HashMap;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str= sc.nextLine();

        // String[] words = str.split(" ");
        // int count=0;
        // HashMap<String,Integer> map = new HashMap<>();
        // for(String e : words){
        //     if(map.get(e)==null){
        //         map.put(e, 1);
        //     }else map.put(e, count+1);
        // }

        // System.out.println(map);

        String str = sc.next();
        int flag=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                flag=1;
                break;
            }
        }
        if(flag ==1){
            System.out.println("contains e");
        }else System.out.println("Doesn't contain e");
    }
    
}
