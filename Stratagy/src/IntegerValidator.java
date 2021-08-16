public class IntegerValidator extends Validator<Integer> {
    private  Integer value;

    public IntegerValidator(Integer value) {
        this.value = value;
    }

    @Override
    public void validate(Integer value) throws ValidationFailException {
        if (value < 1 || value > 10) {
            throw new ValidationFailException("Number out of range");
        }
    }
}
