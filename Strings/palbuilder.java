import java.util.*;
public class palbuilder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        StringBuilder rev=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
             rev.append(s.charAt(i));
        }
        
        if(rev.toString().equals(s)){
             System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        input.close();
    }
}
