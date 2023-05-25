import java.util.Arrays;
import java.util.Scanner;


public class Q17 {

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }
    public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5;i++){
            arr[i]=sc.nextLine();
        }

        Arrays.sort(arr);

        for(int i=0; i<5;i++){
            System.out.println(arr[i]+" ");
        }

        // combine two string
        System.out.println(arr[0].concat(arr[1]));

        // reverse a string
        System.out.println(reverseString(arr[0]));

        sc.close();
    }
    
}
