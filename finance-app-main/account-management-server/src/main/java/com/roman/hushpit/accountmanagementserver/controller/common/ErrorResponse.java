package com.roman.hushpit.accountmanagementserver.controller.common;

import lombok.Builder;
import lombok.Data;

import java.util.Map;
import java.util.Objects;

@Data
@Builder
public class ErrorResponse {
    private Integer statusCode;
    private Boolean success;
    private Map<String, Object> errorDetails;
}
