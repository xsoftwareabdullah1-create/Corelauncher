package net.kdt.pojavlaunch.authenticator.microsoft;

public class PresentedException extends Exception {
    public PresentedException(String message) {
        super(message);
    }

    public PresentedException(String message, Throwable cause) {
        super(message, cause);
    }
}
