package com.cafehub.api.controller.error;

import com.cafehub.api.config.ErrorsMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorPageController {
    @RequestMapping("/404")
    public Error pathNotFound() {
        return Error.builder()
                    .code(HttpStatus.NOT_FOUND.value())
                    .message(ErrorsMessage.PATH_NOT_FOUND)
                    .build();
    }
}
