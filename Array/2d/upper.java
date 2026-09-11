import java.util.Scanner;
public class upper {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] a=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        boolean upper=true;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(row==col){
                if(i>j && a[i][j]!=0){
                    upper=false;
                }
                if(i<=j &&a[i][j]==0){
                    upper=false;
                }}
            }
            }
        
        System.out.println(upper?"Upper Triangle Matrix":"Not an upper triangle matrix");
        sc.close();
        }
    }
