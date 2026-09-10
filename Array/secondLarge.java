package Array;
import java.util.*;
public class secondLarge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n=sc.nextInt();

        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0;int second=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                second=max;
                max=a[i];
                
            }
          
        }
        if(second==Integer.MIN_VALUE){
            System.out.println("No second Largest element");
        }else{
        System.out.println("Second Largest"+second);
        }

    sc.close();}
}
