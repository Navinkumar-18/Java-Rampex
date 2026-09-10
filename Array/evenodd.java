package Array;
import java.util.*;
public class evenodd{
    public static void main(String[] args)
    {
        
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                for(int j=i;j<n;j++){
                    if((a[j]%2)==0){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;break;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");

        }
sc.close();
    }
}