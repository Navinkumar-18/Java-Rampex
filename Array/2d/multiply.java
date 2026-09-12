import java.util.*;
public class multiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first matrix:");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        System.out.println("Enter the size fo second matrix:");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        if(col1==row2){
        int[][] a=new int[row1][col1];
        int[][] b=new int[row2][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int[][] c=new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                     c[i][j]+=a[i][k]*b[k][j];
                }
                
            }
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.println("Result :");
                System.out.print(c[i][j]+" ");
                
            }
            System.out.println();
        }

    }
    sc.close();
}
}
