public class PasswordValidator {
    public static boolean validate(String password){
        return hasMoreThanEightCharacters(password) && password.contains("_");
    }

    private static boolean hasMoreThanEightCharacters(String password) {
        return password.length() >= 8;
    }
}