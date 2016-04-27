import static java.util.regex.Pattern.compile;

public class OneNumberRule implements Rule {
    @Override
    public boolean validate(String password) {
        return compile("[0-9]+").matcher(password).find();
    }
}
