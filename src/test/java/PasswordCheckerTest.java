import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {
    PasswordChecker passwordChecker = new PasswordChecker();

    @Test
    void passwordIsValid() throws IOException {
        String password = "@1Mmtttttttt";
        passwordChecker.passwordIsValid(password);
        assertEquals(0, PasswordChecker.count);
    }

    @Test
    void passwordIsOk() {
        assertTrue(passwordChecker.passwordIsOk());
    }
}