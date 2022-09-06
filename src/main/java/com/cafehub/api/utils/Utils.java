package com.cafehub.api.utils;

import com.cafehub.api.config.Keys;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.stream.Collectors;

public class Utils {
    public static String getErrorMessage(final BindingResult bindingResult) {
        return bindingResult.getFieldErrors().stream()
                .map(FieldError::getDefaultMessage)
                .collect(Collectors.joining(Keys.DELIMITER_CHARACTER));
    }
}
