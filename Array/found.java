package Array;
import java.util.*;
public class found {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no  of elements:");
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int s=sc.nextInt();
        boolean  found=false;
        for(int i=0;i<n;i++){
            if(a[i]==s){
                found=true;
                break;
            }
        }
        System.out.println(found?"Founded":"Not Found");
        sc.close();

    }
}
