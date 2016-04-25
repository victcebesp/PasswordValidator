import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Password {

    private String validPassWord;

    @Before
    public void setUp() throws Exception {
        validPassWord = "abc2de_Fgh";
    }

    @Test
    public void shouldBeAValidPassword(){
        assertTrue(PasswordValidator.validate(validPassWord));
    }

    @Test
    public void shouldHasEightCharacters(){
        String passWordWithLessThanEight = "abc2d";
        assertFalse(PasswordValidator.validate(passWordWithLessThanEight));
    }

    @Test
    public void shouldHasAnUnderscore (){
        String passwordWithoutUnderscore = "abc2deFgh";
        assertFalse(PasswordValidator.validate(passwordWithoutUnderscore));
    }

    @Test
    public void shouldContainACapitalLetter(){
        assertFalse(PasswordValidator.validate("abc2de_gh"));
    }
    
    @Test
    public void shouldContainALowerLetter(){
        assertFalse(PasswordValidator.validate("ABC2DE_FGH"));
    }
}
