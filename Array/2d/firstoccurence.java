import java.util.Scanner;

public class firstoccurence {
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
        int k=sc.nextInt();
      
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(a[i][j]==k){
                    System.out.println("Found at "+i+","+j);//System.out.printf("Found at %d %d",i,j);
                    sc.close();
                    return;
                }
            }
        }
        System.out.println("Not found");
       sc.close();
    }
}
