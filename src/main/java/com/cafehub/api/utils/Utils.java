package com.cafehub.api.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.stream.Collectors;

public class Utils {
    private static final String DELIMITER_CHARACTER = ", ";

    public static String getErrorMessage(final BindingResult bindingResult) {
        return bindingResult.getFieldErrors().stream()
                .map(FieldError::getDefaultMessage)
                .collect(Collectors.joining(DELIMITER_CHARACTER));
    }
}
