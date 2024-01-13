package com.narentie.springcrud.exception;

public class NotSupportedApiCallException extends RuntimeException {
    public NotSupportedApiCallException() {
    }

    public NotSupportedApiCallException(String message) {
        super(message);
    }

    public NotSupportedApiCallException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotSupportedApiCallException(Throwable cause) {
        super(cause);
    }

    public NotSupportedApiCallException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
