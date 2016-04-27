public class LengthRule implements Rule {
    @Override
    public boolean validate(String password) {
        return password.length() >= 8;
    }
}
