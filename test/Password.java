import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Password {

    @Test
    public void shouldBeAValidPassword() {
        assertTrue(PasswordValidator.validate("abc2de_Fgh"));
    }

    @Test
    public void shouldHasEightCharacters(){
        assertFalse(PasswordValidator.validate("abc2d"));
    }

    @Test
    public void shouldHasAnUnderscore (){
        assertFalse(PasswordValidator.validate("abc2deFgh"));
    }

    @Test
    public void shouldContainACapitalLetter() {
        assertFalse(PasswordValidator.validate("abc2de_gh"));
    }
    
    @Test
    public void shouldContainALowerLetter() {
        assertFalse(PasswordValidator.validate("ABC2DE_FGH"));
    }

    @Test
    public void shouldContainANumber(){
        assertFalse(PasswordValidator.validate("abcasde_Fgh"));
    }
}
