package com.roman.hushpit.accountmanagementserver.exception;

import com.roman.hushpit.accountmanagementserver.exception.common.ApplicationException;

import java.io.Serial;

public class UserAlreadyCreatedException extends ApplicationException {
    @Serial
    private static final long serialVersionUID = -3471722595038339640L;


    public UserAlreadyCreatedException(String message) {
        super(message);
    }

    public UserAlreadyCreatedException(String message, Throwable cause) {
        super(message, cause);
    }
}
