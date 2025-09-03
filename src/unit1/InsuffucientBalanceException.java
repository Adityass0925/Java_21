package src.unit1;

public class InsuffucientBalanceException extends RuntimeException {
    public InsuffucientBalanceException(String message) {
        super(message);
    }
}
