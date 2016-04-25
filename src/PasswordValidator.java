public class PasswordValidator {
    public static boolean validate(String password){
        return hasMoreThanEightCharacters(password);
    }

    private static boolean hasMoreThanEightCharacters(String password) {
        return password.length() >= 8;
    }
}