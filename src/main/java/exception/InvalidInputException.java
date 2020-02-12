package exception;

public class InvalidInputException extends IllegalArgumentException {

    public static InvalidInputException from(String errorMessage) {
        return new InvalidInputException(errorMessage);
    }

    private InvalidInputException(String errorMessage) {
        super(errorMessage);
    }
}
