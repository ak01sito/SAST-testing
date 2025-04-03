public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        String username = "admin"; // Simulating user input
        User user = userService.getUserByUsername(username);

        if (user != null) {
            System.out.println("User found: " + user.getUsername());
        } else {
            System.out.println("User not found.");
        }
    }
}
