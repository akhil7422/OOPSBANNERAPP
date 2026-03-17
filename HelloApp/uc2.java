package HelloApp;

public class uc2 {
    public static void main(String[] args) {

        // Check if at least one argument is provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Handle case when no argument is passed
            System.out.println("Hello! Please provide your name as a command-line argument.");
        }
    }
}

