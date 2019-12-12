import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PasswordChecker passwordChecker = new PasswordChecker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        String password = scanner.nextLine();
        try {
            passwordChecker.passwordIsValid(password);
            System.out.println(passwordChecker.passwordIsOk());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
