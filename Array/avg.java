package Array;
import java.util.*;
public class avg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements:");
        int n=sc.nextInt();
        
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<n;i++){
            total+=a[i];
        }
        System.out.println("Average:"+(float)total/n);
        sc.close();
    }
}
