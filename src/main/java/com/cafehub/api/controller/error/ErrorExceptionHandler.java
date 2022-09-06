package com.cafehub.api.controller.error;

import com.cafehub.api.config.Keys;
import com.cafehub.api.exception.DataNotFoundException;
import com.cafehub.api.exception.InvalidParameterException;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ErrorExceptionHandler {
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED)
    @ResponseBody
    public Error handlerMethodNotAllowedException() {
        return Error.builder()
                    .code(HttpStatus.NOT_FOUND.value())
                    .message(Keys.Messages.PATH_NOT_FOUND)
                    .build();
    }

    @ExceptionHandler(DataAccessException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Error handlerDataAccessException() {
        return Error.builder()
                    .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .message(Keys.Messages.CONNECT_ERROR_MESSAGE)
                    .build();
    }

    @ExceptionHandler(InvalidParameterException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Error handlerInvalidParameterException(final InvalidParameterException ex) {
        return Error.builder()
                    .code(HttpStatus.BAD_REQUEST.value())
                    .message(ex.getMessage())
                    .build();
    }

    @ExceptionHandler(DataNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public Error handlerDataNotFoundException(final DataNotFoundException ex) {
        return Error.builder()
                    .code(HttpStatus.NOT_FOUND.value())
                    .message(ex.getMessage())
                    .build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Error handlerException() {
        return Error.builder()
                    .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .message(Keys.Messages.SERVER_ERROR_MESSAGE)
                    .build();
    }
}
