public class PasswordValidator {

    private static final LowerCaseRule lowerCaseRule = new LowerCaseRule();
    private static final OneNumberRule oneNumberRule = new OneNumberRule();
    private static final LengthRule lengthRule = new LengthRule();
    private static final UnderScoreRule underScoreRule = new UnderScoreRule();
    private static final UpperCaseRule upperCaseRule = new UpperCaseRule();

    public static boolean validate(String password){
        return  lengthRule.validate(password)
                && underScoreRule.validate(password)
                && upperCaseRule.validate(password)
                && lowerCaseRule.validate(password)
                && oneNumberRule.validate(password);
    }
}