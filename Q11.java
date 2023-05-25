import java.util.Scanner;

public class Q11 {
    // 11.1 Write a Java program that takes a number as input and prints its multiplication table up to 10.
    public static void Mul(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }

    // 11.2 Write a java program to check that given number is prime or not.
    public static void checkPrime(int n){
        int flag = 0;
        
        for(int i=2 ; i<=n/2; i++){
            if((n%i)==0) flag = 1;
        }
        if(flag == 0){
            System.out.println(n+" is Prime");
        }else System.out.println(n+" is Not Prime");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n= sc.nextInt();
        // Mul(n);
        checkPrime(n);
        
    }
    
}
