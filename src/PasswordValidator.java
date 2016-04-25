import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean validate(String password){
        return hasMoreThanEightCharacters(password)
               && hasAnUnderscore(password) && containsAtLeastOneUppercaseCharacter(password);
    }

    private static boolean containsAtLeastOneUppercaseCharacter(String password) {
        Pattern pattern = Pattern.compile("[A-Z]+");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean hasAnUnderscore(String password) {
        return password.contains("_");
    }

    private static boolean hasMoreThanEightCharacters(String password) {
        return password.length() >= 8;
    }
}