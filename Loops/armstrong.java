import java.util.*;
import java.lang.Math;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int input=n;
        int count=0;int sum=0;
        while(n>0){
             count=count+1;
             n=n/10;
        }
        n=input;
        while(n>0){
            int digit=n%10;
            sum+=(int)Math.pow(digit,count);
            n=n/10;
        }
        System.out.println((input==sum)?"Armstrong":"Not Armstrong");
        sc.close();
    }
}
