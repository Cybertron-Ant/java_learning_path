import java.util.Scanner;

/* accepts username as input and prints the entered username as output */
public class UsernameInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Username entered: " + username);
    }
}
