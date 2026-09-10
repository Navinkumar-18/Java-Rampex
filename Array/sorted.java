
import java.util.*;
public class sorted{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] a=new int[5];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean sorted=true;
        boolean des=true;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                sorted=false;
            }
            if(a[i]<a[i+1]){
                des=false;
            }
        
        }
        
        if(sorted){
            System.out.println("Ascending");
        }else if(des){
            System.out.println("Descending");
        }else{
            System.out.println("Not Sorted");
        }
        sc.close();
        
    }
}