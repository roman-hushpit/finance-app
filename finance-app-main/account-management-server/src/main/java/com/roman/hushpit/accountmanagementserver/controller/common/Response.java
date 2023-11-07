package com.roman.hushpit.accountmanagementserver.controller.common;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Response<T> {
    private Integer statusCode;
    private Boolean success;
    private T entity;
}
