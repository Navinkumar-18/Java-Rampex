import java.util.*;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sq=num*num;
        int unit=sq%10;
        
        if(num==unit){
            System.out.println("Automorphic");
        }else{
            System.out.println("Not Automorphic");
        }
     sc.close();
    }
}
