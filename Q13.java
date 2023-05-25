import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q13 {

    //13.1 Write Java Program to find the transpose of a given matrix
    public static void traspose(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Original matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int[][] arr2 =  new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                arr2[i][j]=arr[j][i];
            }
        }

        System.out.println("Transpose of matrix: ");
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }  
    }

    // 13.2 
    public static void countWords(String str) throws Exception{
        FileReader file = new FileReader(str);
        BufferedReader br = new BufferedReader(file);
        String line;
        int count=0;
        

        while((line=br.readLine())!=null){
            String[] words = line.split(" ");
            count = count + words.length;   
            
        }

        System.out.println(count);
                  
        br.close();
    }
    public static void main(String[] args) throws Exception{
        // traspose();
        countWords("test.txt");
    }
}
