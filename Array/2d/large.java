import java.util.*;
public class large{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] a=new int[row][col];
        int max=Integer.MIN_VALUE;        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]>max){
                    max=a[i][j];
                }

            }
        }
        System.out.println(max);
        sc.close();
    }
}