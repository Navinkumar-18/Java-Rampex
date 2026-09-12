import java.util.*;
public class longestlength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
    
         int max=0;int count=0;
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)!=' '){
                count++;
           }else {
            if(max<count){
               max=count;
            }
               count=0;
        }
    }
        if(count>max){
            max=count;
        }
           
        
        System.out.println(max);
        sc.close();
    }
}
