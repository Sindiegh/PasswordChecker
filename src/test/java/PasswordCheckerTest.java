import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordCheckerTest {
    @Test
    public void existingPassword()  {
    assertEquals("password should exist",
            PasswordChecker.passwordIsValid(""));
    }
    @Test
    public  void passwordLength() {
        assertEquals("password should be longer than 8 characters",
          PasswordChecker.passwordIsValid("abcdefg"));
    }
    @Test
    public  void upperCasePassword() {
        assertEquals("password should have at least one uppercase letter",
          PasswordChecker.passwordIsValid("abcdefghi"));
    }
    @Test
    public  void lowerCasePassword() {
        assertEquals("password should have at least one lowercase letter",
          PasswordChecker.passwordIsValid("ABCDEFGHI"));
    }
    @Test
    public  void digitPassword() {
        assertEquals("password should have at least one digit",
          PasswordChecker.passwordIsValid("asdfghjkJ"));
    }@Test
    public  void passwordSpecialChar() {
        assertEquals("password should have at least one special character",
          PasswordChecker.passwordIsValid("Asdfghjkt6"));
    }
    @Test
    public  void passwordIsValid() {
        assertEquals("Password is valid!",
          PasswordChecker.passwordIsValid("AsdfghjkJ9!"));
    }
    @Test
    public  void passwordIsOk() {
        assertTrue(PasswordChecker.passwordIsOk("asdfghjkJ9!"));
    }

}

