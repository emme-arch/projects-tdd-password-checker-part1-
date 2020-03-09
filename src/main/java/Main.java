
import java.util.Scanner;

/**
 * Created by Linkon on 09 Mar, 2020
 */
public class Main {
    public static void main(String[] args) {
        PasswordChecker passwordChecker = new PasswordChecker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password to check if it is valid");
        try {
            passwordChecker.passwordIsValid(scanner.nextLine());
            System.out.println("Password is ok");
        } catch (Exception e){
            System.out.println(e+", Please try again");
        }
    }
}
