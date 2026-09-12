import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean p=true;
        int n=s.length()-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char last=s.charAt(n-i);
            if(ch!=last){
                 p=false;
            }
        }
        System.out.println(p?"Palindrome":"Not Palindrome");
        sc.close();
    }
}

