package com.cafehub.api.exception;

public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(final String message) {
        super(message);
    }
}
