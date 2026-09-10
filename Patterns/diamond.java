import java.util.*;
public class diamond{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //first half
            for(int j=1;j<=n-i;j++){
                   System.out.print("  ");
            }
            for(int j=1;j<(i*2);j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        //second half
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
               System.out.print("  ");
            }
            for(int j=1;j<(i*2);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
