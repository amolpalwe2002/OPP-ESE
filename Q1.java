import java.util.HashSet;

public class Q1 {
    // 1.1 Program to remove all repeated elements from an array
    public static void removeDuplicates(int a[]){
        int len = a.length;
        System.out.print("Original Array: ");
        for(int i=0; i<len;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nLength of original array: "+len);

        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(a[i]==a[j]){
                    a[j]=a[len-1];
                    len--;
                }
            }
        }

        System.out.print("\nOperated Array: ");
        for(int i=0; i<len;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nLength of operated array: "+len);
        
    }

    // 1.2 Write a Java program to find the common elements between two arrays of integers.
    public static void commonElements(int[] a1, int[] a2){
        HashSet<Integer> hs = new HashSet<>();
        System.out.print("Common Elements without using HashSet: ");
        for(int i=0; i<a1.length;i++){
            for(int j=0; j<a2.length; j++){
                if(a1[i]==a2[j]){
                    System.out.print(a1[i]+" ");
                    hs.add(a1[i]);
                }
            }
        }
        System.out.print("\nCommon Elements using HashSet: ");
        for(int n: hs){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,2,1,5,10,10,11};
        int[] arr1 = {1,2,4,5,7};
        int[] arr2 = {5,2,10,11};
        removeDuplicates(arr); 
        System.out.println("##############");   
        commonElements(arr, arr2); 

    }
    
}
