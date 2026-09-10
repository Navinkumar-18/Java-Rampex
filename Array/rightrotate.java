package Array;
import java.util.*;
public class rightrotate {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int last=a[n-1];
        for(int i=n-1;i>0;i--){
              a[i]=a[i-1];
        }
        a[0]=last;

        for(int num:a){
        System.out.print(num+" ");
    }
    sc.close();
    }
}
