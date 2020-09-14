package exceptions;

public class UnCurrentAgeEception extends Exception{
    public UnCurrentAgeEception() {
    }

    public UnCurrentAgeEception(String message) {
        super(message);
    }

    public UnCurrentAgeEception(String message, Throwable cause) {
        super(message, cause);
    }

    public UnCurrentAgeEception(Throwable cause) {
        super(cause);
    }

    public UnCurrentAgeEception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
