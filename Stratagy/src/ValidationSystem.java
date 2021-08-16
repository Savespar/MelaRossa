public class ValidationSystem<T> {
    private Validator validator;

    public void validate(T t) throws ValidationFailException {
        validator.validate(t);
    }

    public ValidationSystem(Validator validator) {
        this.validator = validator;
    }


}
