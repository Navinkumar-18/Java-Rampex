import java.util.Scanner;

public class diagonalsum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] a=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(row==col){
            if (i==j||i+j==row-1) {
                sum+=a[i][j];
            }
        }}}
       System.out.println(sum);
        
   
        sc.close(); 
    }
    
}
