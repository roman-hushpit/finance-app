package com.roman.hushpit.accountmanagementserver.exception.common;

import java.io.Serial;

public class ApplicationException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -673831719575836804L;

    public ApplicationException(){};

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
