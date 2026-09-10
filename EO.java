import java.util.*;
public class EO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int[] odd=new int[n];
        int[] even=new int[n];
        int evenCount=0,oddCount=0;
        for(int i=0;i<n;i++){
            if(array[i]%2==0){
                even[evenCount++]=array[i];
            }else{
                odd[oddCount++]=array[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(" ");
             System.out.print(array[i]);
        }
        System.out.println(" ");
     for(int i=0;i<evenCount;i++){
        System.out.print(" ");
        System.out.print(even[i]);
     }System.out.println(" ");
     for(int i=0;i<oddCount;i++){
        System.out.print(" ");
        System.out.print(odd[i]);
     }
     System.out.println(" ");
     if(evenCount>oddCount){
        System.out.println("Even");
     }else if(oddCount>evenCount){
        System.out.println("Odd");
     }else{
       System.out.println("Equal");
     }
     sc.close();



    }
}
