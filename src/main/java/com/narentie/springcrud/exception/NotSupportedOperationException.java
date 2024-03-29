package com.narentie.springcrud.exception;

public class NotSupportedOperationException extends RuntimeException {
    public NotSupportedOperationException() {
    }

    public NotSupportedOperationException(String message) {
        super(message);
    }

    public NotSupportedOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotSupportedOperationException(Throwable cause) {
        super(cause);
    }

    public NotSupportedOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
