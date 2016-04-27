import static java.util.regex.Pattern.compile;

public class UpperCaseRule implements Rule {
    @Override
    public boolean validate(String password) {
        return compile("[A-Z]+").matcher(password).find();
    }
}
