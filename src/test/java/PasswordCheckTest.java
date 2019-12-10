import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {
    PasswordCheck passwordChecker = new PasswordCheck();

    @Test
    void passwordIsValid() throws IOException {
        String password = "@1Mmtttttttt";
        passwordChecker.passwordIsValid(password);
        assertEquals(0,PasswordCheck.count);
    }

    @Test
    void passwordIsOk() {
        assertEquals(true,passwordChecker.passwordIsOk());
    }
}