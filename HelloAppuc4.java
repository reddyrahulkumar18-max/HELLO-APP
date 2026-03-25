public class HelloAppuc4 {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Use String.join() to combine all names with comma and space
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
