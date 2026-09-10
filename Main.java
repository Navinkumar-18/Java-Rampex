import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        String str=sc.nextLine().toLowerCase();
        char ch=sc.nextLine().charAt(0);
        ch=Character.toLowerCase(ch);
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
    
}
