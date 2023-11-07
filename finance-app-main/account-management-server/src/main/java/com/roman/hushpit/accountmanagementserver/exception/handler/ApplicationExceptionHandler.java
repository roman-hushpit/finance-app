package com.roman.hushpit.accountmanagementserver.exception.handler;


import com.roman.hushpit.accountmanagementserver.controller.common.ErrorResponse;
import com.roman.hushpit.accountmanagementserver.exception.UserAlreadyCreatedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Map;

import static com.roman.hushpit.accountmanagementserver.exception.handler.ErrorCodes.USER_ALREADY_EXIST_ERROR;

public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ UserAlreadyCreatedException.class })
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleAuthenticationException(Exception ex) {
        ErrorResponse re = ErrorResponse.builder()
                .success(false)
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .errorDetails(Map.of(USER_ALREADY_EXIST_ERROR, ex.getMessage()))
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(re);
    }
}
