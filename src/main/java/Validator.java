class Validator {
    boolean lowerCase (String password) {
        boolean results = false;
        for (int i =0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                results = true;
                break;
            }
        }
        return results;
    }
    boolean upperCase (String password) {
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
    boolean digit (String password) {
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
    boolean character (String password) {
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
}
