import static java.util.regex.Pattern.compile;

public class LowerCaseRule implements Rule {

    @Override
    public boolean validate(String password) {
        return compile("[a-z]+").matcher(password).find();
    }
}
