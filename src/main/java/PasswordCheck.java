import java.io.IOException;
class PasswordCheck {

    public static int count = 6;
    private boolean check = false;
    private Validator validations = new Validator();

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
        if (!validations.lowerCase(password)) {
            System.out.println(passwordIsOk());
            throw new IOException("password should have at least one lowercase letter");
        }else {
                count --;
        }
        if (!validations.upperCase(password)) {
            System.out.println(passwordIsOk());
            throw new IOException("password should have at least one uppercase letter");
        }else {
            count --;
        }
        if (!validations.digit(password)) {
            System.out.println(passwordIsOk());
            throw new NumberFormatException("password should at least have one digit");
        }else {
            count --;
        }
        if (!validations.character(password)) {
            System.out.println(passwordIsOk());
            throw new IOException("password should have at least one special character");
        }else {
            count --;
        }
    }
    boolean passwordIsOk() {

        boolean results = true;
        if (count > 3 && check) {
            results = false;
        }
        return results;
    }
}
