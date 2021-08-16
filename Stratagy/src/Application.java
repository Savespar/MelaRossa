import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) throws ValidationFailException {
        Integer value = 15;
        String line = "Vjafg";
        ValidationSystem vs = new ValidationSystem(new IntegerValidator(value));
        vs.validate(value);
        ValidationSystem vs2 = new ValidationSystem(new StringValidator(line));
        vs2.validate(line);

    }
}
