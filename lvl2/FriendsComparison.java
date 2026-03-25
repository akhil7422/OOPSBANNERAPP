package lvl2;
import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Step a: Arrays to store age and height
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input values
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Step b: Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Step c: Display results
        System.out.println("\nYoungest Friend: " + names[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}
