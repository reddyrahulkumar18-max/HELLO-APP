public class HelloAppuc2 {
    public static void main(String[] args) {

        // Check if command-line argument is provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default message
            System.out.println("Hello, World!");
        }
    }
}
