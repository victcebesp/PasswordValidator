public class PasswordValidator {
    public static boolean validate(String password){
        return hasMoreThanEightCharacters(password) && hasAnUnderscore(password);
    }

    private static boolean hasAnUnderscore(String password) {
        return password.contains("_");
    }

    private static boolean hasMoreThanEightCharacters(String password) {
        return password.length() >= 8;
    }
}