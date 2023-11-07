package com.roman.hushpit.accountmanagementserver.controller;


import com.roman.hushpit.accountmanagementserver.controller.common.Response;
import com.roman.hushpit.accountmanagementserver.controller.entity.RegisterUserRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/users")
public interface UserController {
    @PostMapping
    Response<Object> registerUser(@Valid RegisterUserRequest registerUserRequest);
}
