package Array;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       
        int left =0;int right=n-1;boolean p=true;
        while(left<right){
           if(a[left]!=a[right]){
               p=false;
               break;
           }
           right--;
           left++;
        }
        System.out.println(p?"Palindrome":"Not palindrome");
sc.close();
    }
}
