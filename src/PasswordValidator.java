import static java.util.regex.Pattern.compile;

public class PasswordValidator {
    public static boolean validate(String password){
        return hasMoreThanEightCharacters(password)
               && hasAnUnderscore(password)
               && containsAtLeastOneUppercaseCharacter(password)
               && containsAtLeastOneLowercaseCharacter(password)
               && containsAtLeastOneNumber(password);
    }

    private static boolean containsAtLeastOneLowercaseCharacter(String password) {
        return matchPattern(password, "[a-z]+");
    }

    private static boolean containsAtLeastOneUppercaseCharacter(String password) {
        return matchPattern(password, "[A-Z]+");
    }

    private static boolean containsAtLeastOneNumber(String password) {
        return matchPattern(password, "[0-9]+");
    }

    private static boolean matchPattern(String password, String regex) {
        return compile(regex).matcher(password).find();
    }

    private static boolean hasAnUnderscore(String password) {
        return password.contains("_");
    }

    private static boolean hasMoreThanEightCharacters(String password) {
        return password.length() >= 8;
    }
}