package com.roman.hushpit.accountmanagementserver.controller.impl;

import com.roman.hushpit.accountmanagementserver.controller.UserController;
import com.roman.hushpit.accountmanagementserver.controller.common.Response;
import com.roman.hushpit.accountmanagementserver.controller.entity.RegisterUserRequest;
import com.roman.hushpit.accountmanagementserver.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserControllerImplementation implements UserController {

    private final UserService userService;

    @PostMapping
    @Override
    public Response<Object> registerUser(@Valid @RequestBody RegisterUserRequest registerUserRequest) {
        userService.registerUser(registerUserRequest);
        return Response.builder()
                .success(true)
                .statusCode(HttpStatus.CREATED.value())
                .build();
    }
}
