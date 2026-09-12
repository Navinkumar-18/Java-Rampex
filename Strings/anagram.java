//Find anagrams  without builtin methods

import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int[] freq=new int[256];
        for(int i=0;i<s1.length();i++){
             freq[s1.charAt(i)-'a']+=1;
        }
        for(int i=0;i<s2.length();i++){
             freq[s2.charAt(i)-'a']-=1;
        }
        boolean anagram=true;;
        for(int i:freq){
             if(i!=0){
                anagram=false;
                break;
             }
        }
        System.out.println(anagram?"Anagrams":"Not anagrams");
        sc.close();

    }
}
