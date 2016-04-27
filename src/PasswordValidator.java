public class PasswordValidator {

    private static final LowerCaseRule lowerCaseRule = new LowerCaseRule();
    private static LengthRule lengthRule = new LengthRule();
    private static UnderScoreRule underScoreRule = new UnderScoreRule();
    private static UpperCaseRule upperCaseRule = new UpperCaseRule();

    public static boolean validate(String password){
        return  lengthRule.validate(password)
                && underScoreRule.validate(password)
                && upperCaseRule.validate(password)
                && lowerCaseRule.validate(password)
                && new OneNumberRule().validate(password);
    }
}//replace method with polimorphism