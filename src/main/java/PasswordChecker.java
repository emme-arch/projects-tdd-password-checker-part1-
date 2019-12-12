import java.io.IOException;
class PasswordChecker {

    public static int count = 6;
    private boolean check = false;
    void passwordIsValid(String password) throws IOException {
        if(password.length() < 1) {
            check = true;
            System.out.println(passwordIsOk());
            throw new ArithmeticException("password should exist");
        }else {
            count --;
        }
        if (password.length() < 9){
            check = true;
            System.out.println(passwordIsOk());
            throw new ArithmeticException("password should be longer than than 8 characters");
        }else {
            count --;
        }
        if (!lowerCase(password)) {
            System.out.println(passwordIsOk());
            throw new IOException("password should have at least one lowercase letter");
        }else {
                count --;
        }
        if (!upperCase(password)) {
            System.out.println(passwordIsOk());
            throw new IOException("password should have at least one uppercase letter");
        }else {
            count --;
        }
        if (!digit(password)) {
            System.out.println(passwordIsOk());
            throw new NumberFormatException("password should at least have one digit");
        }else {
            count --;
        }
        if (!character(password)) {
            System.out.println(passwordIsOk());
            throw new IOException("password should have at least one special character");
        }else {
            count --;
        }
    }
    private boolean lowerCase (String password) {
        boolean results = false;
        for (int i =0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                results = true;
                break;
            }
        }
        return results;
    }
    private boolean upperCase (String password) {
        boolean results = false;
        char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                results = true;
                break;
            }
        }
        return results;
    }
    private boolean digit (String password) {
        boolean results =  false;
        char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isDigit(c)) {
                results = true;
                break;
            }
        }
        return results;
    }
    private boolean character (String password) {
        boolean results = false;
        char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                results = true;
                break;
            }
        }
        return results;
    }
    boolean passwordIsOk() {
        boolean results = true;
        if (count > 3 && check) {
            results = false;
        }
        return results;
    }
}
