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
}
