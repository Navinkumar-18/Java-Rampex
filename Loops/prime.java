import java.util.*;
public class prime {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         boolean prime=true;
         if(n<=1){prime=false;}else{
        for(int i=2;i<n;i++){
         if(n%i==0){
            prime=false;
            break;
         }}
        }
         System.out.println(prime?"Prime":"Not Prime");
         sc.close();
    }
}
