import java.util.regex.Pattern;

public class StringValidator extends Validator<String> {
    String line;

    public StringValidator(String line) {
        this.line = line;
    }

    @Override
    public void validate(String s) throws ValidationFailException {
        //Pattern pattern = Pattern.compile("^[A-Z].*");
        if (Pattern.matches("^[A-Z, А-Я].*", line)) {
            throw new ValidationFailException("Invalid string");
        }
    }
}
