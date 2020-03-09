import java.io.IOException;
class PasswordChecker {

    public static int count = 6; // To check if all 6 conditions are met by decrementing the value by 1 if password meet the requirement.
    private boolean check; // check keep track of minimum requirement, if first two conditions are met, then check become true and set Password to OK.
    void passwordIsValid(String password) throws IOException { //
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
            throw new ArithmeticException("password should be longer than 8 characters");
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
    private boolean lowerCase (String password) { // checking each character from the string if it is lowercase, when one is found the function breaks and return true.
        boolean results = false;
        for (int i =0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                results = true;
                break;
            }
        }
        return results;
    }
    private boolean upperCase (String password) { // checking each character from the string if it is uppercase, when one is found the function breaks and return true.
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
    private boolean digit (String password) { // checking each character from the string if it is a digit, when one is found the function breaks and return true.
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
    private boolean character (String password) { // checking if there is a character, when one is found the function breaks and return true.
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
    boolean passwordIsOk() {  // the given password meets at least three of the conditions listed above then this function will return true, otherwise it will return false.
        boolean results = true;
        if (count > 3 && check) {
            results = false;
        }
        return results;
    }
}
