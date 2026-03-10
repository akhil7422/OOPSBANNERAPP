package lvl1;
import  java.util.Scanner;
public class q3 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        double kg,pounds;
        System.out.print("Enter the weight in pounds : ");
        pounds=scanner.nextDouble();
        kg=pounds/2.2;
        System.out.println("The weight of the person in pounds is" +pounds +" and in kg is"+ kg);
        scanner.close();
    }
        
}
