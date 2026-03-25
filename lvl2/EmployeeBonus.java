package lvl2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;

        // Step b: Arrays for salary and years of service
        double[] salary = new double[n];
        double[] yearsOfService = new double[n];

        // Step c: Arrays for bonus and new salary
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Step d: Input with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double yrs = sc.nextDouble();

            // Validate input
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // decrement index to re-enter data
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        // Step e: Calculate bonus and new salary
        for (int i = 0; i < n; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            // Totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display individual details (optional but useful)
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        // Step f: Print totals
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
