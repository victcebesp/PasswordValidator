public class UnderScoreRule implements Rule{

    @Override
    public boolean validate(String password) {
        return password.contains("_");
    }
}
