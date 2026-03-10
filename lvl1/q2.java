package lvl1;
import  java.util.Scanner;
public class q2 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
          double principal,rate,time,interest;
        System.out.print("Enter the principal amount : ");
        principal=scanner.nextDouble();
        System.out.print("Enter the Rate : ");
        rate=scanner.nextDouble();
        System.out.print("Enter the time : ");
        time=scanner.nextDouble();
        interest=(principal*time*rate)/100;
        System.out.println("The Simple interest is "+interest+" for Principal "+principal+" Rate of interest "+rate+ " and time "+time);
        scanner.close();
    }
}
