import java.util.*;
public class triangle{
    public  static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2){
            System.out.println("valid traingle");
            if(side1==side2 &&side2==side3){
                System.out.println("Equilateral Triangle");

            }
            else if((side1==side2)||(side2==side3)||(side1==side3)){
                     System.out.println("Isoceles Triangle");
            }else{
                System.out.println("Scalene Triangle");
            }
        }else{
            System.out.println("Invalid Triangle");
        }
        sc.close();
    }
}