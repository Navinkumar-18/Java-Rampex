import java.util.Scanner;
public class colsum {
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
        int max_col=0;;
        int totalmax=Integer.MIN_VALUE;
        for(int i=0;i<col;i++){
            int sum=0;
            for(int j=0;j<row;j++){
                sum+=a[j][i];
            }
            if(sum>totalmax){
                    totalmax=sum;
                    max_col=i;
                    
                }
        }
        System.out.println("Column "+max_col+" has max sum of "+totalmax);
        sc.close();   
    }
}
