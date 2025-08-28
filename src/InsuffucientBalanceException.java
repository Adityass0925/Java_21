package src;

public class InsuffucientBalanceException extends RuntimeException {
    public InsuffucientBalanceException(String message) {
        super(message);
    }
}
