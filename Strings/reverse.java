
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder rev=new StringBuilder("");
        int n=s.length()-1;
        for(int i=0;i<s.length();i++){
               rev.append(s.charAt(n-i));
        }
        System.out.println(rev);
        sc.close();
    }
}
