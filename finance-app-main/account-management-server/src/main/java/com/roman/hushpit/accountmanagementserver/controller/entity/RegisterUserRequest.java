package com.roman.hushpit.accountmanagementserver.controller.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegisterUserRequest {

    @Email
    @NotNull
    @NotEmpty
    private String email;
    @NotNull
    @NotEmpty
    @Size(min = 8, max = 20)
    private String password;
}
