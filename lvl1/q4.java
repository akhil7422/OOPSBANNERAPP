package lvl1;
import  java.util.Scanner;
public class q4 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int numberofStudents;
        System.out.print("Enter the no of Students : ");
        numberofStudents=scanner.nextInt();
        System.out.println("# of Possible handsake "+(numberofStudents*(numberofStudents-1)/2));
        scanner.close();
    }
}
