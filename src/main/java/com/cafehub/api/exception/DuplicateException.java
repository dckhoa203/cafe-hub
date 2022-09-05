package com.cafehub.api.exception;

public class DuplicateException extends RuntimeException {
    public DuplicateException(final String message) {
        super(message);
    }
}
