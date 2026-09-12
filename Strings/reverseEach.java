import java.util.*;
public class reverseEach {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder rev=new StringBuilder("");
        StringBuilder word=new StringBuilder("");
        int n=s.length()-1;
        for(int i=0;i<s.length();i++){
              if(s.charAt(i)!=' '){
                 word.append(s.charAt(i));
              }
              else{
                rev=word.reverse();
                rev.append(' ');
                  
              }    
        }
        System.out.println(rev);
        sc.close();
    }
}
