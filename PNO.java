import java.util.*;
public class PNO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter a value");
            int num=sc.nextInt();
            if(num>0){
                System.out.println(" The given value is positive.");
            }else if (num<0) {
                System.out.println("The given value is negative.");
            }else{
                System.out.println("The given value is Zero.");
            }
            sc.close();
        }
    }
}
